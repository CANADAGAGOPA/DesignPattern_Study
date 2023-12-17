package DP08_TemplateMethodPattern.BeverageWithHook;

import java.util.Scanner;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public abstract void addCondiments();

    boolean customerWantsCondiments() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to add sugar and milk?");
        String  answer = sc.next();

        if (answer.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
}
