package task23;

import java.util.Arrays;

class Student implements Comparable<Student> {
    public String firstName;
    public int height;
    public int age;

    Student(String a, int b, int c) {
        firstName = a;
        height = b;
        age = c;
    }
   
    //sort by using there age
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
        }
        }
     
public class Task1 {
    public static void main(String[] args) {
        //sort some student with theèhelp of student class
        Student[] students = new Student[5];
        students[0] = new Student("John", 20, 90);
        students[1] = new Student("Alice", 22, 85);
        students[2] = new Student("Bob", 21, 95);
        students[3] = new Student("Charlie", 20, 80);
        students[4] = new Student("David", 21, 92);
        //sort the students based on their age as sudent use comparable interface so use it
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.age + " " + student.height);
            }
    
        //print the sorted students
    }
}
//Student class> firstName, lastName, age, height, use custom sorting by their 2nd character, Student class> firstName, lastName, age, height, use comparable for natural order sorting by comparing their age
   
