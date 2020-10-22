
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);
            
            for (int i = 0; i < pieces.length; i++) {
                if (age > count) {
                    count = age;
                   name = pieces[0];
                }
            }
            System.out.println("Name of the oldest: " + name);
        }
    }
}
