package com.hhm.chainpattern.arraymode.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Ming
 * @Date 2020/9/1 21:58
 * @Version 1.0
 */
public class ArrayModeHandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler){
        handlers.add(handler);
    }

    public void handle(){
        for (IHandler handler : handlers){
            boolean handle = handler.handle();
        }
    }
}
