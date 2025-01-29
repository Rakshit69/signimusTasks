package task9;

public class Task3 {
    public static void main(String[] args) {
        //Write a program to count the occurrences of a specific character in a string
        String str = "Hello, World! How are you?";
        int c = 0;
        char target = 'o';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                c++;

            }
        }
        System.out.println("the count is " + c);




    }
}
