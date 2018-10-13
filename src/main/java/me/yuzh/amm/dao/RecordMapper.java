package me.yuzh.amm.dao;

import me.yuzh.amm.bean.Record;
import me.yuzh.amm.vo.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface RecordMapper {


    @Select("select * from money_record order by  ${sortName }  ${sortOrder}  limit #{rowoffset},#{pageSize}")
    List<Record> allMoneyRecord(Page page);

    @Select("select count(*) from money_record")
    Integer count();

    @Select("select * from money_record order by id desc limit 0,1 ")
    Record last();

    @Insert("insert into money_record (type,money,remain,recordDate) values(#{type},#{money},#{remain},#{recordDate})")
    int insert(Record record);

    @Delete("delete from money_record where id = #{id}")
    int delete(Integer id);




}
