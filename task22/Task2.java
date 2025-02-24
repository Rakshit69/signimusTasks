import java.util.LinkedList;
import java.util.ListIterator;

public class Task2 {
    public static void main(String[] args) {
        /*
         * Create a LinkedList of city names.
        Use a ListIterator to traverse the list forward and print all cities.
        Then, traverse the list in reverse order and print the cities again.
        */
        LinkedList<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Philadelphia");
        cities.add("Phoenix");
        cities.add("San Antonio");
        cities.add("San Diego");
        cities.add("Dallas");
        cities.add("San Jose");
        cities.add("Austin");
        cities.add("Jacksonville");
        //        Use a ListIterator to traverse the list forward and print all cities.
        ListIterator<String> iterator = cities.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //        Then, traverse the list in reverse order and print the cities again.
        iterator = cities.listIterator(cities.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }




            



    }
}
