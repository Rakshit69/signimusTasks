package task9;

public class Task2 {
    public static void main(String[] args) {
        //check a palindrome in string
        String str = "madam";
        System.out.println(isPalindrome(str));
        }

        public static boolean isPalindrome(String str) {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
}
