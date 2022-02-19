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
}
