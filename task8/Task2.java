public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 
                    6, 7, 8, 9, 10,
                11, 12, 13, 14, 15 };
                            
        int max = 0;
        int min = 9999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
