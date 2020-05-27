package com.hhm.chainpattern.baseframe;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/27 23:20
 */
public abstract class Handler {
    private Handler nextHandler = null;

    public final Response handleMessage(IRequest request) {
        Response response = this.handler(request);
        if (response.isResult()) {
            return response;
        }

        if (this.nextHandler != null) {
            return this.nextHandler.handleMessage(request);
        }
        Response defaultResponse = new Response();
        defaultResponse.setResult(false);
        defaultResponse.setMsg("都处理失败了。");
        return defaultResponse;
    }

    /**
     * 每个处理者都必须实现处理任务
     *
     * @param request
     * @return
     */
    protected abstract Response handler(IRequest request);

    /**
     * 设置下一个处理者是谁
     *
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
