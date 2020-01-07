package com.hhm.adapter.class_adapter;

/**
 *
 * @author houhaimin
 * @date 2019/12/21
 */
public class ClassAdapterMain {

    public static void main(String[] args) {
        ClassTargetable classTargetable = new ClassAdapter();
        classTargetable.print();
        classTargetable.show();
    }

}
