import java.util.Enumeration;
import java.util.Vector;

public class Task3 {
    public static void main(String[] args) {
        /*
         * Create a Vector of country names.
        Use Enumeration to print all country names.
        */
        Vector<String> countryList = new Vector<>();
        countryList.add("India");
//        Use Enumeration to print all country names.
Enumeration<String> enumCountry = countryList.elements();
while(enumCountry.hasMoreElements()){
    System.out.println(enumCountry.nextElement());
    }
    }
}
