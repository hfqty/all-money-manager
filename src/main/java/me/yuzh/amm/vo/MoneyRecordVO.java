package me.yuzh.amm.vo;

import me.yuzh.amm.bean.Record;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MoneyRecordVO extends Record{

    private String recordDateStr ;

    private static SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public String getRecordDateStr() {
        return recordDateStr;
    }

    public void setRecordDateStr() {
        this.recordDateStr = dateTimeFormat.format(super.getRecordDate());
    }


}
