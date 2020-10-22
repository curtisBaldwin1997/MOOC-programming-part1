
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int answer = 1; 
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        
        for(int i = 1; i <= num; i++){
            answer = answer * (i);
        }
        System.out.println("Factorial: " + answer);
    }
}
