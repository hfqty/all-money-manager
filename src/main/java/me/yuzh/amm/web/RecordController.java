package me.yuzh.amm.web;

import me.yuzh.amm.bean.Record;
import me.yuzh.amm.components.Result;
import me.yuzh.amm.service.RecordService;
import me.yuzh.amm.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping("/newRecord")
    public String newRecord(Record record){
        String result = recordService.newRecord(record).getData()?"记好了":"没记住";
        return result ;
    }

    @GetMapping("/allMoneyRecord")
    public Page<Record> allMoneyRecord(Integer rowoffset,Integer pageSize,String sortOrder,String sortName){
        return recordService.allMoneyRecord(new Page<>(rowoffset,pageSize,sortOrder,sortName));
    }

}
