package com.hhm.chainpattern.baseframe;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/27 23:37
 */
public class ConcreteHandler1 extends Handler {

    @Override
    protected Response handler(IRequest request) {
        NumberRequest numberRequest = (NumberRequest) request;
        System.out.println("ConcreteHandler1: "+numberRequest.toString());
        Response response = new Response();
        String numberRequestStr = numberRequest.getStr();
        response.setResult(false);
        response.setMsg("ConcreteHandler1 没有处理。");

        if (numberRequestStr != null && numberRequestStr.length() < 2){
            response.setResult(true);
            response.setMsg("ConcreteHandler1 处理了。");
        }

        return response;
    }
}
