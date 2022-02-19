package com.Interface;

public class Duck extends Bird implements Swimmable, Flyable{
    public Duck() {
        name = "duck";
        colour = Colour.WHITE;
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    public void Fly() {
        System.out.println("Duck can fly");
    }

}
