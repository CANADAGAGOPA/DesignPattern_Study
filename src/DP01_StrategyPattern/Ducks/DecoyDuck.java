package DP01_StrategyPattern.Ducks;

import DP01_StrategyPattern.FlyBehavior.FlyNoWay;
import DP01_StrategyPattern.QuackBehavior.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("나는 나무오리!");
    }
}
