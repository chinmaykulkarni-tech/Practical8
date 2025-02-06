class TrianglePatterns {
    
   
    static void printIncreasing(int row, int col, int size) {
        if (row > size) return; 

        if (col < row) {
            System.out.print("* ");
            printIncreasing(row, col + 1, size);
        } else {
            System.out.println(); 
            printIncreasing(row + 1, 0, size); 
        }
    }

   
    static void printDecreasing(int row, int col) {
        if (row == 0) return; 

        if (col < row) {
            System.out.print("* ");
            printDecreasing(row, col + 1); 
        } else {
            System.out.println(); 
            printDecreasing(row - 1, 0); 
        }
    }

    public static void main(String[] args) {
        int size = 5; 
        printIncreasing(1, 0, size+1); 
        printDecreasing(size, 0);    
    }
}

