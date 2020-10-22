
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of gift?");
        int value = Integer.valueOf(scan.nextLine());

        if (value >= 5000 && value <= 25000) {
            double calculation = (100 + (value - 5000) * 0.08);
            System.out.println("Tax: " + calculation);
        } else if (value >= 25000 && value <= 55000) {
            double calculation2 = (1700 + (value - 25000) * 0.10);
            System.out.println("Tax: " + calculation2);
        } else if (value >= 55000 && value <= 200000) {
            double calculation3 = (4700 + (value - 55000) * 0.12);
            System.out.println("Tax: "+calculation3);
        } else if (value >= 200000 && value <= 1000000) {
            double calculation4 = (22100 + (value - 200000) * 0.15);
            System.out.println("Tax: "+calculation4);
        } else if (value >= 1000000) {
            double calculation5 = (142100 + (value - 1000000) * 0.17);
            System.out.println("Tax: " + calculation5);
        } else {
            System.out.println("No tax!");
        }
    }
}
