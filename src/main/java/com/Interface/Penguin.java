package com.Interface;

public class Penguin extends Bird implements Swimmable {
    public Penguin() {
        name = "penguin";
        colour = Colour.GREY;
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }

}
