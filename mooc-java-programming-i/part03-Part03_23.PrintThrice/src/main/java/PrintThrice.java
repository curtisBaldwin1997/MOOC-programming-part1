
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String name = scanner.nextLine();
        System.out.println("Give a word: ");
        System.out.println(name + name + name);
    }
}
