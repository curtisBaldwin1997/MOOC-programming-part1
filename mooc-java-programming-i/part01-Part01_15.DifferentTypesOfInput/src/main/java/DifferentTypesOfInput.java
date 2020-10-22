
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String word = scanner.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double doub = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean boo = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string "+word);
        System.out.println("You gave the integer "+num);
        System.out.println("You gave the double "+doub);
        System.out.println("You gave the boolean "+boo);
        // Write your program here

    }
}
