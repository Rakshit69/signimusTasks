package task9;

public class Task4 {
    public static String advanceTrim(String input) {
        if (input == null) {
            return null; // Handle null input
        }
        return input.trim().replaceAll("\\s+", " ");
    }
    public static void main(String[] args) {
        //advanceTrim method to remove whitespaces from starting and ending and if more than one space in between the words
        String str = "   Hello   World   ";
        System.out.println("Original String: " + str);
        System.out.println("Trimmed String: " + advanceTrim(str));
        
    }
}
