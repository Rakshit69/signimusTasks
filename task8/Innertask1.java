public class Innertask1 {

    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5,
                6, 7, 8, 9, 10,
                11, 12, 13, 14, 15,
                16, 17, 18, 19, 20 };
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("the sum of arr elements is" +  sum + " and avg is" + sum/n);
    }

}