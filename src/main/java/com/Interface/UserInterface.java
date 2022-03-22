package com.Interface;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public void printAllBirds(List<Bird> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public int showMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:\n 1.Add Bird \n 2.Remove Bird \n" +
                           " 3.Update the Bird \n 4.Print all birds \n 5.Print Swimmable Birds \n " +
                           "6.Print Flyable Birds \n 7.Exit");
        return sc.nextInt();
    }

    public void printSwimmableBirds(List<Bird> list) {
//        list.stream().filter(bird -> bird instanceof Swimmable).forEach(bird -> ((Swimmable) bird).swim());
        list.stream().filter(bird -> bird.isSwimmable).forEach(System.out::println);
    }

    public void printFlyableBird(List<Bird> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isFlyable) {
                System.out.println(list.get(i));
            }
        }
    }
}
