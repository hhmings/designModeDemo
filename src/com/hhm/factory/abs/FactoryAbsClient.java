package com.hhm.factory.abs;

/**
 * 抽象工厂模式：一个工厂类可以创建一系列的产品
 *
 * 主要优点：
 *
 *
 * @author houhaimin
 * @date 2020/1/7
 */
public class FactoryAbsClient {

    public static void main(String[] args) {

        SkinFactory factory = new SpringSkinFactory();
        Button button = factory.createButton();
        button.display();


    }

}
