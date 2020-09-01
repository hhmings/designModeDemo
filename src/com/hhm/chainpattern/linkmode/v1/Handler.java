package com.hhm.chainpattern.linkmode.v1;

/**
 * @Author Ming
 * @Date 2020/9/1 21:44
 * @Version 1.0
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle(){
        boolean nexted = doHandle();
        if (nexted && successor != null){
            successor.handle();
        }
    }

    public abstract boolean doHandle();
}
