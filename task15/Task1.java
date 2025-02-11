package task15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Task1 {
    
    public static void main(String[] args) {
        //Add and retrieve elements from an ArrayList and a LinkedList.
        //Use the add() method to add elements to the ArrayList and LinkedList.
        //Use the get() method to retrieve elements from the ArrayList and LinkedList.
        //do it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0)); // prints 1
        System.out.println(list.get(1)); // prints 2
        System.out.println(list.get(2)); // prints 3    

        //Demonstrate insertion order and sorting in TreeSet.
        //Use the add() method to add elements to the TreeSet.
        //Use the first() method to retrieve the first element from the TreeSet.
        //Use the last() method to retrieve the last element from the TreeSet.
        //do it
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.first()); // prints 1
        System.out.println(set.last()); // prints 3
        //Use a HashMap to store and retrieve student details (roll number, name).
        //Use the put() method to store student details in the HashMap.
        //Use the get() method to retrieve student details from the HashMap.
        //do it
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Alice");
        map.put(3, "Bob");
        System.out.println(map.get(1)); // prints John
        
    }
}
