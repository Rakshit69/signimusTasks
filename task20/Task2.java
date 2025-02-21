package task20;

import java.time.LocalDate;

public class Task2 {
    
}
/*
 

Immutable Class: Person
Create an immutable class Person to represent a person with the following attributes:

firstName (String)
lastName (String)
dateOfBirth (LocalDate)
Make the class immutable:

Declare all fields as final.
Use a constructor to initialize all fields.
Do not provide any setter methods.
Implement the following methods:

String getFullName(): Returns the full name of the person (e.g., "John Doe").
int getAge(): Calculates and returns the current age of the person based on the dateOfBirth.
*/
class Person {
    private final String firstName;
    private final String lastName;
    private final java.time.LocalDate dateOfBirth;

    Person(String a, String b, LocalDate c) {
        firstName = a;
        lastName = b;
        dateOfBirth = c;

    }
    //getfullname
    public String getFullName() {
        return firstName + " " + lastName;
    }
    //getage
    public int getAge() {
        return java.time.LocalDate.now().getYear() - dateOfBirth.getYear();
    }
            

}