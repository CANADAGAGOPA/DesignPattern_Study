package DP08_TemplateMethodPattern.SortTrest.DuckSort;

import DP07_AdapterFacadePattern.Adapter.Duck.Duck;

import java.util.*;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Ducks[] ducks = {
                new Ducks("Daffy", 8),
                new Ducks("Dewey", 2),
                new Ducks("Howard", 7),
                new Ducks("Louie", 2),
                new Ducks("Huey", 2)
        };

        System.out.println("Before sorting");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting");
        display(ducks);
    }

    public static void display(Ducks[] ducks) {
        for (Ducks d : ducks) {
            System.out.println(d);
        }
    }
}
