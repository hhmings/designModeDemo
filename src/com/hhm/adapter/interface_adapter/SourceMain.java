package com.hhm.adapter.interface_adapter;

/**
 *
 * @author houhaimin
 * @date 2019/12/21
 */
public class SourceMain {

    public static void main(String[] args) {

        SourceSub sourceSub = new SourceSub();
        SourceSub2 sourceSub2 = new SourceSub2();

        sourceSub.print();
        sourceSub.show();
        System.out.println("----------");

        sourceSub2.show();
        sourceSub2.print();
    }
}
