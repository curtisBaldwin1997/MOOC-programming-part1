
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        int smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);

        int i = 0;
        while (i < list.size()) {
            if (smallest == list.get(i)) {
                System.out.println(smallest + " is at index " + i);
            }
            i++;
        }

    }
}
