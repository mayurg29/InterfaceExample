package com.Interface;

import java.util.Objects;

public class Bird{

    enum Colour{
        GREEN, BLACK, RED, YELLOW, WHITE, GREY;
    }

    enum Gender{
        MALE, FEMALE, OTHER;
    }

    String id;
    String name;
    Colour colour;
    Gender gender;
    boolean isFlyable;
    boolean isSwimmable;

    @Override
    public String toString() {
        return "Bird{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour=" + colour +
                ", gender=" + gender +
                ", isFlyable=" + isFlyable +
                ", isSwimmable=" + isSwimmable +
                '}';
    }

    void eat(){
        System.out.println(name + " can eat");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return id.equals(bird.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
