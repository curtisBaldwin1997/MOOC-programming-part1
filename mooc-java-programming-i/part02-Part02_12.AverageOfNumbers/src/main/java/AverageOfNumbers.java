
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        double average = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else {
                sum = (sum + num);
                amount++;
                
            }

        }
        average = 1.0* sum / amount;
        System.out.println("Average of the numbers: " + average);
    }
}
