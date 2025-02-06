public class Pattern3 {
    public static void main(String[] args) {
        int size = 3; // Defines the size of the pattern
        printTriangle(1, size);
    }

    // Recursive method to print the upper pyramid
    static void printTriangle(int i, int size) {
        if (i > size) {
            printPlus(5); // Print '+' symbols after the pattern
            return;
        }
        printSpaces(size - i);  // Print leading spaces
        printStars(2 * i - 1);  // Print stars in the current row
        System.out.println();   // Move to the next line
        printTriangle(i + 1, size);
    }

    // Recursive method to print spaces
    static void printSpaces(int spaces) {
        if (spaces == 0) return;
        System.out.print(" ");
        printSpaces(spaces - 1);
    }

    // Recursive method to print stars in a row
    static void printStars(int count) {
        if (count == 0) return;
        System.out.print("*");
        printStars(count - 1);
    }

    // Recursive method to print plus symbols in the last part
    static void printPlus(int count) {
        if (count == 0) return;
        System.out.println("  +");
        printPlus(count - 1);
    }
}

