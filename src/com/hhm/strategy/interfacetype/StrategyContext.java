package com.hhm.strategy.interfacetype;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/28 8:02
 */
public class StrategyContext {
    private static StrategyContext strategyContext = null;
    private IStrategy strategy;
    private StrategyContext(){}

    public void operate(){
        if (strategy != null){
            this.strategy.operate();
        }
    }

    public static StrategyContext getsingleton(){
        if (strategyContext == null){
            synchronized (StrategyContext.class){
                if (strategyContext == null){
                    strategyContext = new StrategyContext();
                }
            }
        }
        return strategyContext;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
