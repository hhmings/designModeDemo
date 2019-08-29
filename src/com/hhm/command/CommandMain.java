package com.hhm.command;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/29 23:12
 */
public class CommandMain {
    public static void main(String[] args) {
        // 创建一个接收者
        Receiver receiver = new Receiver();
        // 绑定一个接收者
        Command command = new ConcreteCommand(receiver);
        // 接收者与命令绑定
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommnad();
    }
}
