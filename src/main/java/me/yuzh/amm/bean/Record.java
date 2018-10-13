package me.yuzh.amm.bean;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {

    private Integer id;
    private String type;
    private String typeStr;
    private BigDecimal money;
    private BigDecimal remain;
    private Date recordDate;

    private String recordDateStr ;

    private static SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        String str = null;
        if("sub".equals(this.type)){
            str = "支出";
        }else if("add".equals(this.type)){
            str="收入";
        }
        this.typeStr = str;
    }

    public String getRecordDateStr() {
        return recordDateStr;
    }

    public void setRecordDateStr() {
        this.recordDateStr = dateTimeFormat.format(getRecordDate());
    }

    public Record() {
    }

    public Record(String type, BigDecimal money, BigDecimal remain, Date recordDate) {
        this.type = type;
        this.money = money;
        this.remain = remain;
        this.recordDate = recordDate;
    }

    public Record(Integer id, String type, BigDecimal money, BigDecimal remain, Date recordDate) {
        this.id = id;
        this.type = type;
        this.money = money;
        this.remain = remain;
        this.recordDate = recordDate;
    }

    public Record(Integer id, BigDecimal money, BigDecimal remain) {
        this.id = id;
        this.money = money;
        this.remain = remain;
        this.recordDate = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        setTypeStr(type);
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getRemain() {
        return remain;
    }

    public void setRemain(BigDecimal remain) {
        this.remain = remain;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
        setRecordDateStr();
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", typeStr='" + typeStr + '\'' +
                ", money=" + money +
                ", remain=" + remain +
                ", recordDate=" + recordDate +
                ", recordDateStr='" + recordDateStr + '\'' +
                '}';
    }

    public void show(){
        System.out.println(toString());
    }
}
