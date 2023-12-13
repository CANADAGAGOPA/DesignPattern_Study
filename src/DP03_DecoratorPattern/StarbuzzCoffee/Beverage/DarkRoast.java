package DP03_DecoratorPattern.StarbuzzCoffee.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크로스트";
    }
    public double cost() {
        return 0.99;
    }
}
