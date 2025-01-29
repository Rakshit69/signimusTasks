public class Task3 {
    public static void main(String[] args) {
        // a 2d array and print it in format
        int[][] arr = {
            {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                            {11, 12, 13, 14, 15},
                                    {16, 17, 18, 19, 20}
        };
        printArray(arr);
                                    
        }

    public static void printArray(int[][] arr) {
          for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
                    
    }
}
