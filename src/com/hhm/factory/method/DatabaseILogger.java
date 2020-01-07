package com.hhm.factory.method;

/**
 *
 * @author houhaimin
 * @date 2020/1/7
 */
public class DatabaseILogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("DatabaseILogger writeLog ...");
    }
}
