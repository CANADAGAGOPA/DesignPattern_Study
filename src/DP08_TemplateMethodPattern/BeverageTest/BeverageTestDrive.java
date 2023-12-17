package DP08_TemplateMethodPattern.BeverageTest;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea ...");
        tea.prepareRecipe();
        System.out.println();

        System.out.println("Making coffee ...");
        coffee.prepareRecipe();
        System.out.println();
    }
}
