package task10;

public class Task {
    public static void main(String[] args) {
        //Create a program using StringBuilder to reverse a string and remove vowels from it.
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + sb.reverse());
        System.out.println("String without Vowels: " + sb.reverse().toString().replaceAll("[aAeEiIoOuU]", ""));
        }
    }