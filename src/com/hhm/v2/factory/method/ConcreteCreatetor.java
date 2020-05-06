package com.hhm.v2.factory.method;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/2/17 22:40
 */
public class ConcreteCreatetor implements ICreateor {

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
