package com.hhm.strategy.interfacetype2;

/**
 * @Author Ming
 * @Date 2020/8/31 23:06
 * @Version 1.0
 */
public enum OrderTypeEnum {
    NORMAL(1,"normal"),
    GROUPON(2,"GROUPON"),
    PROMOTION(3,"PROMOTION")
    ;
    private Integer index;
    private String desc;

    OrderTypeEnum(Integer index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    public Integer getIndex() {
        return index;
    }

    public String getDesc() {
        return desc;
    }
}
