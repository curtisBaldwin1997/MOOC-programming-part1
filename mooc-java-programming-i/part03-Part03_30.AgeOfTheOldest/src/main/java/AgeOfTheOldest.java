
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);
            for(int i = 0; i < pieces.length; i++){
                if(age > count){
                    count = age;   
                }
            }
            System.out.println("Age of the oldest: " + count);
        }

    }
}
