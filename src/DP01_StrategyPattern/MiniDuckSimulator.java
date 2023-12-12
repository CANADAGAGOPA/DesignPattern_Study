package DP01_StrategyPattern;

import DP01_StrategyPattern.Ducks.DecoyDuck;
import DP01_StrategyPattern.Ducks.Duck;
import DP01_StrategyPattern.Ducks.MallardDuck;
import DP01_StrategyPattern.Ducks.RubberDuck;
import DP01_StrategyPattern.FlyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        // upcasting 자식 클래스의 객체가 부모 클래스 타입으로 형변환
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        mallard.shotByGun();
        mallard.performFly();
        System.out.println();

        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        rubber.swim();
        System.out.println();

        decoy.display();
        decoy.performQuack();
        decoy.performFly();
        decoy.swim();

        decoy.setFlyBehavior(new FlyRocketPowered());
        decoy.performFly();
        System.out.println();
    }
}
