package task27;

public class Task1 {
    
}
/*
 * Create a generic class Pair<T, U> that can hold two different types of values. Implement methods to set and get these values.
Write a generic method swap() that takes two elements of the same type and swaps their values.
Create a generic method that finds the maximum of three numbers, where the numbers can be
*/
class Pair<T, U> {
    private T first;
    private U second;
    
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
    //setter 
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

}