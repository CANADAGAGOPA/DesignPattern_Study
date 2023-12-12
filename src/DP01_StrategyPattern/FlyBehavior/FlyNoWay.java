package DP01_StrategyPattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("날지 못 한다");
    }
}
