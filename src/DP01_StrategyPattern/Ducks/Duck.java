package DP01_StrategyPattern.Ducks;

import DP01_StrategyPattern.FlyBehavior.FlyBehavior;
import DP01_StrategyPattern.FlyBehavior.FlyNoWay;
import DP01_StrategyPattern.QuackBehavior.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("둥둥 떠다닌다.");
    }

    public abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        System.out.println("우는 방식을 바꾼다.");
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        System.out.println("날아가는 방식을 바꾼다.");
        this.flyBehavior = flyBehavior;
    }

    public void shotByGun() {
        System.out.println("앗 날개에 총을 맞았다");
        setFlyBehavior(new FlyNoWay());
    }
}
