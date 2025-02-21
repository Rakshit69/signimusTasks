package task21;

import java.util.Stack;

public class Task1 {
    //Implement a method that calculates the average of an arbitrary number of double values using varargs.
    public static double average(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    //Two Sum (Easy): LeetCode Problem #1
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    //Valid Parentheses (Easy): LeetCode Problem #20
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '}') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //Remove Element (Easy): LeetCode Problem #27
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    //Reverse Linked List (Easy): LeetCode Problem #206
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    //Palindrome Number (Easy): LeetCode Problem #9
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int reversed = 0;
        int original = x;
        while (x != 0) {
            int remainder = x % 10;
            reversed = reversed * 10 + remainder;

        }
        return true;
    }
}
//create ListNode
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { val = x; }
        }
