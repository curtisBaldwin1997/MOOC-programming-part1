
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        try ( Scanner userinputscan = new Scanner(Paths.get(file))) {
        int line = Integer.valueOf(userinputscan.nextLine());

        for(int i = line; line >= lowerBound && line <= upperBound; i++){
            userinputscan.nextLine();
            count++;
        }
            System.out.println("Numbers: " + count);
        
        
       // while (true) {

          //      if (line >= lowerBound && line <= upperBound) {
          //          userinputscan.nextLine();
           //         count++;
           //         break;
            //    }
           //     System.out.println("Numbers: " + count);
          //  }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
