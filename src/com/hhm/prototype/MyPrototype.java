package com.hhm.prototype;

import java.io.*;
import java.util.List;

/**
 * Created by houhaimin on 2020/1/6.
 */
public class MyPrototype implements Cloneable,Serializable {

    private static final long serialVersionUID = 8696580761642554199L;

    private String name;


    /**
     * 浅复制
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (MyPrototype) super.clone();
    }

    /**
     * 深复制
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
