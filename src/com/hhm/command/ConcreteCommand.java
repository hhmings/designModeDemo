package com.hhm.command;

/**
 *
 * 具体的命令对象。
 *
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/29 23:03
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand execute ...");
        receiver.action();
    }
}
