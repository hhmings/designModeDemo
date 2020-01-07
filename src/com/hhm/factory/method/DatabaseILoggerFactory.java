package com.hhm.factory.method;

/**
 *
 * @author houhaimin
 * @date 2020/1/7
 */
public class DatabaseILoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createILogger() {
        //连接数据库等操作
        ILogger logger = new DatabaseILogger();
        return logger;
    }
}
