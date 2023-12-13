package DP03_DecoratorPattern.StarbuzzCoffee.Condiment;

import DP03_DecoratorPattern.StarbuzzCoffee.Beverage.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 두유 추가";
    }

    public double cost() {
        return 0.15 + beverage.cost();
    }
}
