package com.Interface;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    private static UserInterface instance;

    private UserInterface() {
    }

    public static synchronized UserInterface getInstance() {
        if (instance == null) {
            instance = new UserInterface();
        }
        return instance;
    }

    public int showMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:\n 1.Add Bird \n 2.Remove Bird \n" +
                           " 3.Update the Bird \n 4.Print all birds \n 5.Print Swimmable Birds \n " +
                           "6.Print Flyable Birds \n 7.Print Eating Behaviour \n " + Controller.EXIT_VALUE + ".Exit");
        return sc.nextInt();
    }

    public void printAllBirds(Set<Bird> list){
        list.stream().forEach(System.out::println);
    }

    public void printSwimmableBirds(Set<Bird> list) {
        list.stream().filter(bird -> bird.isSwimmable).forEach(System.out::println);
    }

    public void printFlyableBird(Set<Bird> list) {
        list.stream().filter(bird -> bird.isFlyable).forEach(System.out::println);
    }

    public void printEatingBehaviour(Set<Bird> list) {
        list.stream().forEach(Bird::eat);
    }
}
