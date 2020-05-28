package com.hhm.strategy.interfacetype;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/28 8:03
 */
public class StrategyMain {

    public static void main(String[] args) {

        StrategyFactory.executeByType(StrategyEnum.back_door);
        StrategyFactory.executeByType(StrategyEnum.given_green_light);

    }

}
