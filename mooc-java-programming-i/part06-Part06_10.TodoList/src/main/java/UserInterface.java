
import java.util.ArrayList;
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
    
     private TodoList item;
    private Scanner scanner;
   

    public UserInterface(TodoList item, Scanner scanner) {
        this.scanner = scanner;
        this.item = item;
        
    }

    public void start() {

        while (true) {
            System.out.println("Commmand: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.println("To add:");
                String word = scanner.nextLine();
                this.item.add(word);

            } else if (input.equals("list")) {
                item.print();
                
            } else if(input.equals("remove")){
                System.out.println("Whic one is removed? ");
                int remove = Integer.valueOf(scanner.nextLine());
                this.item.remove(remove);
            }
            
            }
                
    }
}
