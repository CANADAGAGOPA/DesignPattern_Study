package DP03_DecoratorPattern.StarbuzzCoffee.Condiment;

import DP03_DecoratorPattern.StarbuzzCoffee.Beverage.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 추가";
    }

    public double cost() {
        return 0.1 + beverage.cost();
    }
}
