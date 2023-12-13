package DP03_DecoratorPattern.StarbuzzCoffee.Condiment;

import DP03_DecoratorPattern.StarbuzzCoffee.Beverage.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 우유 추가";
    }

    public double cost() {
        return 0.1 + beverage.cost();
    }
}
