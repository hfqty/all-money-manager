package me.yuzh.amm;

import me.yuzh.amm.bean.Record;
import me.yuzh.amm.dao.RecordMapper;
import me.yuzh.amm.vo.Page;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

@MapperScan("me.yuzh.amm.dao")
@SpringBootApplication
public class AmmApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AmmApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames())
                .sorted()
                .forEach(System.out::println);

       /*
            some test code


       RecordMapper recordMapper  = context.getBean(RecordMapper.class);
        Record record  = new Record(1,"add", BigDecimal.valueOf(4730.79),BigDecimal.valueOf(4730.79),new Date());
        int count = recordMapper.insert(record);
        System.out.println(count);
        recordMapper.last().show();


        */
       /* RecordMapper recordMapper  = context.getBean(RecordMapper.class);
        recordMapper.allMoneyRecord(new Page(2,10)).stream()
                .forEach(System.out::println);*/

    }
}
