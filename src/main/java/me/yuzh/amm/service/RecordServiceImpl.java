package me.yuzh.amm.service;

import me.yuzh.amm.bean.Record;
import me.yuzh.amm.components.Result;
import me.yuzh.amm.dao.RecordMapper;
import me.yuzh.amm.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    private RecordMapper recordMapper;


    @Override
    public Page<Record> allMoneyRecord(Page<Record> page) {
        System.out.println(new Date()+"----------"+page);
        if(page==null ||!page.canDo()){
           page = new Page<>(0,10);
        }
        List<Record> moneyRecords = recordMapper.allMoneyRecord(page);
        page.setRows(moneyRecords);
        page.setTotal(recordMapper.count());

        return page;
    }

    @Override
    public Result<Boolean> newRecord(Record record) {
        System.out.println(new Date() +"---------newRecord:"+record);
        BigDecimal money = record.getMoney();
        Record record1  = recordMapper.last();
        System.out.println(new Date()+ "---------record1:"+record1);
        BigDecimal remain = null;
        if(record1 != null){
            remain = record1.getRemain();
        }else{
            remain = BigDecimal.ZERO;
        }
        if("add".equals(record.getType())){
            remain = remain.add(money);
        }else if("sub".equals(record.getType())){
            remain = remain.subtract(money);
        }
        record.setRemain(remain);
        record.setRecordDate(new Date());
       int insertCount = recordMapper.insert(record);
        System.out.println(new Date() + "---------insertCount:" + insertCount);
       if(insertCount ==1){
           return Result.success("1","ok");
       }
        return new Result<>("0","ng",false);
    }

}
