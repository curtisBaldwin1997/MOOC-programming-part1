
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int add = (num1+num2);
        int minus = (num1- num2);
        int times = (num1*num2);
        double divide = (1.0 * num1/num2);
        
        System.out.println( num1 + " + " + num2 + " = " + add);
        System.out.println(  num1 + " - " + num2 + " = " + minus);
        System.out.println(  num1 + " * " + num2 + " = " + times);
        System.out.println(  num1 + " / " + num2 + " = " + divide);

    }
}
