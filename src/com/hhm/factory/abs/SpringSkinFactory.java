package com.hhm.factory.abs;


/**
 * spring 皮肤工厂
 *
 * @author houhaimin
 * @date 2020/1/7
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public Combobox createCombobox() {
        return new SpringCombobox();
    }
}
