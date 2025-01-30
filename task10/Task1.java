package task10;

public class Task1 {
    public static void main(String[] args) {
        //reverse an arr without using another array
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        reverse(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

            
            public static void reverse(int[] arr, int start, int end) {
                while (start < end) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
                    }
    }

