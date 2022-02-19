package com.Interface;

public class Parrot extends Bird implements Flyable{
    public Parrot() {
        name = "parrot";
        colour = Colour.GREEN;
    }

    @Override
    public void Fly() {
    }
}
