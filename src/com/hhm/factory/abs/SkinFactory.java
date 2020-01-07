package com.hhm.factory.abs;

/**
 * 抽象工厂
 *
 * @author houhaimin
 * @date 2020/1/7
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    Combobox createCombobox();
}
