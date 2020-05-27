package com.hhm.chainpattern.baseframe;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/27 23:37
 */
public class ConcreteHandler3 extends Handler {

    @Override
    protected Response handler(IRequest request) {
        NumberRequest numberRequest = (NumberRequest) request;
        System.out.println("ConcreteHandler3: "+numberRequest.toString());
        Response response = new Response();
        String numberRequestStr = numberRequest.getStr();
        response.setResult(false);
        response.setMsg("ConcreteHandler3 没有处理。");

        if (numberRequestStr != null && numberRequestStr.length() < 6){
            response.setResult(true);
            response.setMsg("ConcreteHandler3 处理了。");
        }

        return response;
    }
}
