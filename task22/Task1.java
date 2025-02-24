import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    /**
     * Create an ArrayList of student names.
    Use an Iterator to print all student names.
    Remove a student whose name starts with "A" using Iterator.
     */
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("David");
        studentNames.add("Eve");
        System.out.println("Before removing student: ");
        Iterator<String> iterator = studentNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.remove();
        System.out.println("After removing student: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
