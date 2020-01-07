package com.hhm.adapter.object_adapter;


/**
 * Created by houhaimin on 2019/12/21.
 */
public class ObjectAdapterMain {

    public static void main(String[] args) {
        ObjectTargetable targetable =  new ObjectAdapter(new ObjectSource());
        targetable.print();
        targetable.show();
    }

}
