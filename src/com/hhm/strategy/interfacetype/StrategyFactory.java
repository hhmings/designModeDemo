package com.hhm.strategy.interfacetype;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2020/5/28 8:11
 */
public class StrategyFactory {

    public static void executeByType(StrategyEnum strategyEnum) {
        switch (strategyEnum) {
            case back_door:
                execute(new BackDoor());
                break;

            case given_green_light:
                execute(new GivenGreenLight());
                break;
            default:

        }
    }

    private static void execute(IStrategy strategy){
        StrategyContext context = StrategyContext.getsingleton();
        context.setStrategy(strategy);
        context.operate();
    }
}
