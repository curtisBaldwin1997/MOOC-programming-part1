
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where to? " + num);
        System.out.println("Where from? " +num2);
        for (int i = num; i >= num2; i++) {
            System.out.println(i);
        }
        // Write your program here
    }
}
