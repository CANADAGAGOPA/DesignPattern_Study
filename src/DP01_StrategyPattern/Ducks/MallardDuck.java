package DP01_StrategyPattern.Ducks;

import DP01_StrategyPattern.FlyBehavior.FlyWithWings;
import DP01_StrategyPattern.QuackBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() { // 오리의 특성에 맞게 오버라이드
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("나는 청둥오리!");
    }
}
