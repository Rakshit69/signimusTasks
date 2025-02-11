package task14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Task1 {
    public static void main(String[] args) {
        //Create a Student class with fields name and marks. Serialize and deserialize an object of this class to and from a file.
        Student student = new Student("John", 90);
        try {
            // Serialize the object to a file
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in student.ser");
            // now extract and deserialize form student.ser
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student deserializedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized Student..." + deserializedStudent.name);
            System.out.println("Deserialized Student Marks..." + deserializedStudent.marks);
       
        } catch (Exception e) {
            e.printStackTrace();
        }
                
    }
}
