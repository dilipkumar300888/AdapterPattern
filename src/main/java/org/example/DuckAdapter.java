package org.example;

public class DuckAdapter implements Turkey{
    Duck duck;
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        for(int i = 0;i<5;i++)
            duck.fly();
    }
}
