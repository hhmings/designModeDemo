package com.hhm.v2.factory.method;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/2/17 22:39
 */
public interface ICreateor {
    <T extends Product> T createProduct(Class<T> clazz);
}
