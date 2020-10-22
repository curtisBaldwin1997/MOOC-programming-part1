
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
       int a = num1;
       int b = num2;
       
        System.out.println(a + " * " + b + " = " + (a*b));

    }
}
