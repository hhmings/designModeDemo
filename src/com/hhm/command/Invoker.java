package com.hhm.command;

/**
 *
 * 传递命令对象
 *
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/29 23:06
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommnad(){
        if (command != null){
            command.execute();
        }
    }
}
