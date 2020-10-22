
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

    public static int smallest(int[] array) {
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }

        }
        return minValue;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);

        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                return i;
            }
        }
        return -1;
    }

     public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int startIndexforSubArray = startIndex;
        int[] subArray = new int[table.length - startIndex];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = table[startIndexforSubArray];
            startIndexforSubArray++;
        }
        return startIndex + indexOfSmallest(subArray);
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temproryValueHolder = array[index1];
        array[index1] = array[index2];
        array[index2] = temproryValueHolder;
    }
    
    public static void sort(int [] array){
         for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
