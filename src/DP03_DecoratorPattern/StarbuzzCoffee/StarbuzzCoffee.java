package DP03_DecoratorPattern.StarbuzzCoffee;

import DP03_DecoratorPattern.StarbuzzCoffee.Beverage.Beverage;
import DP03_DecoratorPattern.StarbuzzCoffee.Beverage.DarkRoast;
import DP03_DecoratorPattern.StarbuzzCoffee.Beverage.Espresso;
import DP03_DecoratorPattern.StarbuzzCoffee.Beverage.HouseBlend;
import DP03_DecoratorPattern.StarbuzzCoffee.Condiment.Mocha;
import DP03_DecoratorPattern.StarbuzzCoffee.Condiment.Soy;
import DP03_DecoratorPattern.StarbuzzCoffee.Condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
        /*
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
         */
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
