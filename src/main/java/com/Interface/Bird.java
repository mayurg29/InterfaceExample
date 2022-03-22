package com.Interface;

public class Bird{

    enum Colour{
        GREEN, BLACK, RED, YELLOW, WHITE, GREY;
    }

    enum Gender{
        MALE, FEMALE, OTHER;
    }

    String name;
    Colour colour;
    Gender gender;
    boolean isFlyable;
    boolean isSwimmable;

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", colour=" + colour +
                ", gender=" + gender +
                ", isFlyable=" + isFlyable +
                ", isSwimmable=" + isSwimmable +
                '}';
    }

    void eat(){
        System.out.println(getClass().getSimpleName() + " can eat");
    }

    boolean doesMakesNest(){
        return false;
    }
}
