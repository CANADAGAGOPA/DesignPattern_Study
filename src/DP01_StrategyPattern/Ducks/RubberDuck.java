package DP01_StrategyPattern.Ducks;

import DP01_StrategyPattern.FlyBehavior.FlyNoWay;
import DP01_StrategyPattern.QuackBehavior.Quack;
import DP01_StrategyPattern.QuackBehavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("나는 러버덕!");
    }
}
