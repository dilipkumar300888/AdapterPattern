package org.example;

public class MallardDuck implements Duck{
    public void display() {
        System.out.println("Mallard Duck");
    }


    @Override
    public void quack() {
        System.out.println("Mallard Duck Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck Fly");
    }
}
