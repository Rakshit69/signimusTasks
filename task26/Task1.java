package task26;

public class Task1 {
    public static void main(String[] args) {
        
    }
}
//Library Management System where students (threads) try to borrow and return books. To ensure thread safety, we use synchronized methods so that only one student can borrow or return a book at a time. Use wait() method and notify() method to manage the synchronization.
class Library {
    private String bookName;
    private boolean isBookAvailable = true;
    private boolean isBookBorrowed = false;
    private boolean isBookReturned = false;
    private Object lock = new Object();
    //To ensure thread safety, we use synchronized methods so that only one student
    


}