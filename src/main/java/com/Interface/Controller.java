package com.Interface;

import java.util.Scanner;

public class Controller{
    UserInterface ui = new UserInterface();
    BirdRepository birdRepository = new BirdRepository();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Controller controller = new Controller();
        int option = 0;
        while (option != 7){
            option = controller.ui.showMainMenu();
            controller.handleUserSelection(option);
        }
    }

    public void handleUserSelection(int option){
        switch (option){
            case 1:
                /*Bird duck = new Duck();
                Bird penguin = new Penguin();
                Bird parrot = new Parrot();
                birdRepository.add(duck);
                birdRepository.add(penguin);
                birdRepository.add(parrot);*/
                addBird();
                break;
            case 2:
                System.out.println("Which bird you want to remove? \n duck, parrot, penguin");
                String birdName = sc.next();
                Bird bird = birdRepository.getBird(birdName);
                birdRepository.remove(bird);
                break;
            case 3:
                System.out.println("Enter the bird to update");
                String birdName1 = sc.next();
                Bird bird1 = birdRepository.getBird(birdName1);
                update(bird1);
                break;
            case 4:
                ui.printAllBirds(birdRepository.getBirdList());
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    private void addBird() {
        Bird bird = new Bird();
        System.out.println("Enter the bird name");
        bird.name = sc.next();
        System.out.println("Enter the colour of bird");
        setBirdColour(bird);
        setBirdGender(bird);
        birdRepository.add(bird);
    }

    private void update(Bird bird){
        System.out.println("Enter your Choice:\n 1.name \n 2.colour \n 3.gender");
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter the new name");
                bird.name = sc.next();
                break;
            case 2:
                setBirdColour(bird);
                break;
            case 3:
                setBirdGender(bird);
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void setBirdColour(Bird bird) {
        System.out.println("Enter your choice: \n 1.GREEN \n 2.BLACK \n 3.RED \n " +
                           "4.YELLOW \n 5.WHITE \n 6.GREY");
        int option = sc.nextInt();
        switch (option){
            case 1:
                bird.colour = Bird.Colour.GREEN;
                break;
            case 2:
                bird.colour = Bird.Colour.BLACK;
                break;
            case 3:
                bird.colour = Bird.Colour.RED;
                break;
            case 4:
                bird.colour = Bird.Colour.YELLOW;
                break;
            case 5:
                bird.colour = Bird.Colour.WHITE;
                break;
            case 6:
                bird.colour = Bird.Colour.GREY;
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void setBirdGender(Bird bird) {
        System.out.println("Enter your choice: \n 1.MALE \n 2.FEMALE \n 3.OTHER");
        int option = sc.nextInt();
        switch (option){
            case 1:
                bird.gender = Bird.Gender.MALE;
                break;
            case 2:
                bird.gender = Bird.Gender.FEMALE;
                break;
            case 3:
                bird.gender = Bird.Gender.OTHER;
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}