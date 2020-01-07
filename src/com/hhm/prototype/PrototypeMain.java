package com.hhm.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 原型模式：
 *
 *
 * 浅复制：被复制的对象的所有变量都含有与原来对象相同的值，而所有其他对象的引用仍然指向原来的对象。
 *        换而言之，浅复制仅仅复制所考虑的对象，而不复制它引用的对象。
 *
 * 深复制：被复制对象的所有变量都含有与原来对象相同的值，除去那些引用其他对象的变量。
 *        那些引用其他对象的变量将指向被复制的新对象，而不是原有的那些被引用的对象。
 *        换而言之，深复制把复制的对象所引用的对象都复制了一遍。
 *
 *
 * @author houhaimin
 * @date 2020/1/6
 */
public class PrototypeMain {


    public static void main(String[] args) throws CloneNotSupportedException {
        MyPrototype myPrototype1 = new MyPrototype();
        List<Integer> list = new ArrayList<>();
        list.add(111);
        System.out.println("myPrototype1 : "+myPrototype1);

        MyPrototype myPrototype2 = (MyPrototype) myPrototype1.clone();

        System.out.println("myPrototype2 : "+myPrototype2);
    }
}
