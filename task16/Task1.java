package task16;

public class Task1 {
    //Find the factorial of a number using recursion.
    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }

    }
    //Challenge: Write a recursive program to reverse a string.
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
            
        
    public static void main(String[] args) {
        //Sort an array of integers using selection sort.
        int[] arr = {64, 34, 25, 12, 22,
                11, 90 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
       System.out.println(factorial(4)); 

            
                                
    }
}
