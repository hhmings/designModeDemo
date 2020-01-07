package com.hhm.adapter.object_adapter;


/**
 * Created by houhaimin on 2019/12/21.
 */
public class ObjectAdapter implements ObjectTargetable {

    private ObjectSource objectSource;

    public ObjectAdapter(ObjectSource objectSource) {
        super();
        this.objectSource = objectSource;
    }

    @Override
    public void show() {
        System.out.println("ClassTargetable show method.");
    }

    @Override
    public void print() {
        objectSource.print();
    }


}
