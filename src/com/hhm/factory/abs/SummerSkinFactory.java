package com.hhm.factory.abs;


/**
 * Summer 皮肤工厂
 *
 * @author houhaimin
 * @date 2020/1/7
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public Combobox createCombobox() {
        return new SummerCombobox();
    }
}
