package com.Interface;

public abstract class Bird{
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
