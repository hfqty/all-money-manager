package me.yuzh.amm.service;

import me.yuzh.amm.bean.Record;
import me.yuzh.amm.components.Result;
import me.yuzh.amm.vo.Page;

public interface RecordService {


    Page<Record> allMoneyRecord(Page<Record> page);

    Result<Boolean> newRecord(Record record);
}
