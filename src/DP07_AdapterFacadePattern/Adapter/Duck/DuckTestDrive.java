package DP07_AdapterFacadePattern.Adapter.Duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new MallardDuck();
        Turkey turkey1 = new WildTurkey();
        Duck duck3 = new TurkeyAdapter(turkey1);

        Duck[] ducks = new Duck[100];
        int n = 0;

        ducks[n++] = duck1;
        ducks[n++] = duck2;
        ducks[n++] = duck3;
        ducks[n++] = new MallardDuck();
        ducks[n++] = new TurkeyAdapter(new WildTurkey());

        for (int i = 0; i < n; i++) {
            testDuck(ducks[i]);
        }

        /*
        testDuck(duck1);
        testDuck(duck2);
        testDuck(duck3);
        */
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
