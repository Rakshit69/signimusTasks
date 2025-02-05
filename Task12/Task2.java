package Task12;

public class Task2 {
    public static void main(String[] args) {
        try {
            int age = 0;
            if (age <= 0) {
                throw new CustomException("Age must be greater than 0");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
