package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("The Turkey Says... ");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The Duck Says... ");
        testDuck(mallardDuck);

        System.out.println("The TurkeyAdapter Says... ");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}