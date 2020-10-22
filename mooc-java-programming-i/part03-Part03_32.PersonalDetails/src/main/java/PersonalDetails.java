
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;
        String longestName = new String();
        int letters = 0;
       
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);
            sum = sum + Integer.valueOf(pieces[1]);
            count = count + 1;
            average = (1.0 * sum / count);
            
            int length = pieces[0].length();
            if(letters <= length){
                letters = length;
            } else if(pieces[0].length() == letters){
                longestName = pieces[0];
            }
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + average);
        }
    }
}
