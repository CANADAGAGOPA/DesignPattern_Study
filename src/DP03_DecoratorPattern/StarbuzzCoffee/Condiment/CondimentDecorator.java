package DP03_DecoratorPattern.StarbuzzCoffee.Condiment;

import DP03_DecoratorPattern.StarbuzzCoffee.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
