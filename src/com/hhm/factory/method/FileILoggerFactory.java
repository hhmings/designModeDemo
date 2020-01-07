package com.hhm.factory.method;

/**
 *
 * @author houhaimin
 * @date 2020/1/7
 */
public class FileILoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createILogger() {
        // 其他操作
        ILogger logger = new FileILogger();
        return logger;
    }
}
