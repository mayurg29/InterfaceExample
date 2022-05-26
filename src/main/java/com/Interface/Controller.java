package com.Interface;

import java.util.Scanner;

public class Controller {
    static final int EXIT_VALUE = 8;

    public static void main(String[] args) {
        Controller controller = new Controller();
        UserInterface ui = UserInterface.getInstance();
        int option = 0;
        while (option != EXIT_VALUE) {
            option = ui.showMainMenu();
            controller.handleUserSelection(option);
        }
    }

    public void handleUserSelection(int option) {
        Scanner sc = new Scanner(System.in);
        UserInterface ui = UserInterface.getInstance();
        BirdRepository birdRepository = BirdRepository.getInstance();
        switch (option) {
            case 1:
                addBird();
                break;
            case 2:
                System.out.println("Which bird you want to remove? \n duck, parrot, penguin");
                String birdName = sc.next();
                Bird bird = birdRepository.getBird(birdName);
                birdRepository.remove(bird);
                break;
            case 3:
                System.out.println("Enter a bird to update");
                String birdName1 = sc.next();
                Bird bird1 = birdRepository.getBird(birdName1);
                updateBird(bird1);
                break;
            case 4:
                ui.printAllBirds(birdRepository.getBirdList());
                break;
            case 5:
                ui.printSwimmableBirds(birdRepository.getBirdList());
                break;
            case 6:
                ui.printFlyableBird(birdRepository.getBirdList());
                break;
            case 7:
                ui.printEatingBehaviour(birdRepository.getBirdList());
                break;
            case EXIT_VALUE:
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    private void addBird() {
        Scanner sc = new Scanner(System.in);
        BirdRepository birdRepository = BirdRepository.getInstance();
        Bird bird = new Bird();
        System.out.println("Enter the bird id");
        bird.id = sc.next();
        System.out.println("Enter the bird name");
        bird.name = sc.next();
        System.out.println("Enter the colour of bird");
        setBirdColour(bird);
        setBirdGender(bird);
        System.out.println("Enter is bird swimmable ?");
        bird.isSwimmable = sc.nextBoolean();
        System.out.println("Enter is bird flyable ?");
        bird.isFlyable = sc.nextBoolean();
        birdRepository.add(bird);
    }

    private void updateBird(Bird bird) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice:\n 1.name \n 2.colour \n 3.gender " +
                            "\n 4.Swimmable \n 5.Flyable \n 6.Id");
        int option = sc.nextInt();
        switch (option) {
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
            case 4:
                System.out.println("Is bird swimmable?");
                bird.isSwimmable = sc.nextBoolean();
                break;
            case 5:
                System.out.println("Is bird Flyable?");
                bird.isFlyable = sc.nextBoolean();
                break;
            case 6:
                System.out.println("Enter the new Id");
                bird.id = sc.next();
            default:
                System.out.println("Invalid option");
        }
    }

    private void setBirdColour(Bird bird) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: \n 1.GREEN \n 2.BLACK \n 3.RED \n " +
                            "4.YELLOW \n 5.WHITE \n 6.GREY");
        int option = sc.nextInt();
        switch (option) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: \n 1.MALE \n 2.FEMALE \n 3.OTHER");
        int option = sc.nextInt();
        switch (option) {
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