package task10;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        // check if two string are anagram
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }

    //write in anagram fuction
public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
        }
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
        }
    

}
