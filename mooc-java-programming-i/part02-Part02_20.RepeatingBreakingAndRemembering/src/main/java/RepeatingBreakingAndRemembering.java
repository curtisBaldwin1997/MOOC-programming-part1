
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int totalNum = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;

            }
            
            if (num % 2 == 0){
                even++;
            } else {
                odd++;
            }
            sum += num;
            totalNum++;
            average = (double) sum / totalNum;
        }

        System.out.println("Thx! Bye!");
        System.out.println("sum: " + sum);
        System.out.println("Numbers: " + totalNum);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }

}
