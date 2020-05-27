package com.hhm.chainpattern.baseframe;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/27 23:18
 */
public class NumberRequest implements IRequest {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "NumberRequest{" +
                "str='" + str + '\'' +
                '}';
    }
}
