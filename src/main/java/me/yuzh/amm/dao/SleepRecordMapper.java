package me.yuzh.amm.dao;

import me.yuzh.amm.bean.SleepRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SleepRecordMapper {


    @Select("select * from sleep_record ")
    List<SleepRecord> all();

    @Insert("insert into sleep_record (type,time) values(#{type},#{time})")
    int insert(SleepRecord sleepRecord);


}
