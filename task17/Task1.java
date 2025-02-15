package task17;

import java.util.Stack;

public class Task1 {

    public static void main(String[] args) {
        //Implement a stack to reverse a string.
        Stack<Character> stack = new Stack<>();
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));

        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = stack.pop() + reversed;
        }
            System.out.println(reversed);
    }
}