package com.hhm.proxy;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/28 20:26
 */
public class ProxyClient {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        SubjectProxy proxy = new SubjectProxy();
        Subject subject = (Subject) proxy.bind(realSubject);
        subject.request();
    }
}
