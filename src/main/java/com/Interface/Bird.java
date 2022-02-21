package com.Interface;

public class Bird{
    @Override
    public String toString() {
        return "Bird{" +
                "name = '" + name + '\'' +
                ", colour = " + colour +
                ", gender = " + gender +
                '}';
    }

    enum Colour{
        GREEN, BLACK, RED, YELLOW, WHITE, GREY;
    }

    enum Gender{
        MALE, FEMALE, OTHER;
    }

    String name;
    Colour colour;
    Gender gender;

    void eat(){
        System.out.println(getClass().getSimpleName() + " can eat");
    }

    boolean doesMakesNest(){
        return false;
    }
}
