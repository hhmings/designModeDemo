package com.hhm.adapter.class_adapter;


/**
 *
 * @author houhaimin
 * @date 2019/12/21
 */
public class ClassAdapter extends ClassSource implements ClassTargetable {
    @Override
    public void show() {
        System.out.println("ClassTargetable show method.");
    }
}
