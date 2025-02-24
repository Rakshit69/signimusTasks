package task24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
// write age comparator and rollnumber somparator
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

class RollNumberComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);

    }
}

public class Task1 {
public static void main(String[] args) {
    /*
     * Use Collections.sort() to sort the list:
    Once using the natural ordering (based on name).
    Once using the AgeComparator.
    Once using the RollNumberComparator.
    Print the sorted lists to verify the correctness of the sorting.
    */
    List<Student> students = new ArrayList<>();
    students.add(new Student("John", 20));
    students.add(new Student("Alice", 22));
    students.add(new Student("Bob", 21));
    students.add(new Student("Charlie", 20));
    students.add(new Student("David", 22));
    students.add(new Student("Eve", 21));
    students.add(new Student("Frank", 20));
    students.add(new Student("George", 22));
    students.add(new Student("Hannah", 21));
    students.add(new Student("Ivan", 20));
    // Collections.sort(students);
    System.out.println("Sorted by name: " + students);
    Collections.sort(students, new AgeComparator());
    System.out.println("Sorted by age: " + students);
    Collections.sort(students, new RollNumberComparator());
    System.out.println("Sorted by roll number: " + students);

}
}
/*
 * Create a list of Student objects with sample data.
Use Collections.sort() to sort the list:
Once using the natural ordering (based on name).
Once using the AgeComparator.
Once using the RollNumberComparator.
Print the sorted lists to verify the correctness of the sorting.

*/

        

