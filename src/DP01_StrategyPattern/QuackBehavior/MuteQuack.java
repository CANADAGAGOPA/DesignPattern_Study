package DP01_StrategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("조용하다.");
    }
}
