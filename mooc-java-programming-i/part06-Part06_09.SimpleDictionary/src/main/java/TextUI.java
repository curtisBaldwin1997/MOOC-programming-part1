
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
public class TextUI {

    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Commmand: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);

            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String translate = this.dictionary.translate(toBeTranslated);
                if (translate == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation " + this.dictionary.translate(toBeTranslated));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}
