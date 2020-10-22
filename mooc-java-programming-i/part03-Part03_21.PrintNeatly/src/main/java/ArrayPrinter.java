
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
         for (int count = 0; count < array.length; count++) {

            System.out.print(array[count]);

            if (count == array.length-1) {
                // do nothing at end
            } else {
                System.out.print(", ");
            }
        }
    }
}
