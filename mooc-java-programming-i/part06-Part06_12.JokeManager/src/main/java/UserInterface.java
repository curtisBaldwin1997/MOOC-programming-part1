
import java.util.ArrayList;
import java.util.Random;
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

    private JokeManager list;
    private Scanner scanner;

    public UserInterface(JokeManager list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;

    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            process(command);
        }
    }

    public void process(String command) {
        if (command.equals("1")) {
            addJoke();
        } else if (command.equals("2")) {
            drawJoke();
        } else {
            printJokes();
        }
    }

    private void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        list.addJoke(joke);
    }

    private void drawJoke() {
        System.out.println("Drawing a joke.");
        System.out.println(list.drawJoke());
    }

    private void printJokes() {
        System.out.println("Drawing a joke.");
        list.printJokes();
    }

}

// ArrayList<String> jokes = new ArrayList<>();
//    System.out.println("What a joke!");

