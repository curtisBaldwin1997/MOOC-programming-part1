
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeStatistics stats = new GradeStatistics();
        UserInterface ui = new UserInterface(stats, scanner);

        ui.start();
    }
}