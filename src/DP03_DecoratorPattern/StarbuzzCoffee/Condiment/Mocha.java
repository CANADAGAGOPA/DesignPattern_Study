package DP03_DecoratorPattern.StarbuzzCoffee.Condiment;

import DP03_DecoratorPattern.StarbuzzCoffee.Beverage.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카 추가";
    }

    public double cost() {
        return 0.2 + beverage.cost();
    }
}
