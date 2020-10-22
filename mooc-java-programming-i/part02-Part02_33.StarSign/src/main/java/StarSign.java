
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(5);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        int max = 1;

        while (max <= number) {
            System.out.print("*");
            max++;

        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int max = 0;

        while (max < size) {
            printStars(4);
            max++;
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int max = 0;

        while (max < height) {
            printStars(width);
            max++;
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int numSize = 0;
        while (numSize < size) {
            printStars(numSize);
            numSize++;
        }

    }

}
