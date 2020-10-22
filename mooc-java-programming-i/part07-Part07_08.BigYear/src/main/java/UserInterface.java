
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author curtis
 */
public class UserInterface {

    private BirdWatcher list;
    private Scanner scanner;
    

    public UserInterface(BirdWatcher list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;

    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            process(command);
        }
    }

    public void process(String command) {
        if (command.equals("Add")) {
            addBird();

        } else if (command.equals("Observation")) {
            addObservation();
        } else if (command.equals("All")) {
            printBirds();
        } else if (command.equals("One")) {
            printOne();

        }
    }

    private void addBird() {

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Name in Latin: ");
        String latin = scanner.nextLine();       
        list.add(name, latin);
    }

    private void addObservation() {
        System.out.print("Bird? ");
        String birdObserved = scanner.nextLine();
        list.addObservation(birdObserved);
    }

    private void printBirds() {
        list.printAll();
    }
    
    private void printOne(){
        System.out.println("Bird? ");
        String birdName = scanner.nextLine();
        list.printOneBird(birdName);
    }

}
