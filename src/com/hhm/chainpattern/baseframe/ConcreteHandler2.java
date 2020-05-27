package com.hhm.chainpattern.baseframe;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/27 23:37
 */
public class ConcreteHandler2 extends Handler {

    @Override
    protected Response handler(IRequest request) {
        NumberRequest numberRequest = (NumberRequest) request;
        System.out.println("ConcreteHandler2: "+numberRequest.toString());
        Response response = new Response();
        String numberRequestStr = numberRequest.getStr();
        response.setResult(false);
        response.setMsg("ConcreteHandler2 没有处理。");

        if (numberRequestStr != null && numberRequestStr.length() < 4){
            response.setResult(true);
            response.setMsg("ConcreteHandler2 处理了。");
        }

        return response;
    }
}
