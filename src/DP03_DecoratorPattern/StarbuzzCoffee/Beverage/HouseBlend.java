package DP03_DecoratorPattern.StarbuzzCoffee.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 블렌드";
    }

    public double cost() {
        return 0.89;
    }
}
