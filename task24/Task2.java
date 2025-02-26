package task24;

public class Task2 {
public static void main(String[] args) {
    OddThread ob = new OddThread();
    EvenThread ob1 = new EvenThread();
    ob.start();
    ob1.start();

}
}
//Create a Java program where two threads run simultaneously, one printing even numbers and the other printing odd numbers
// from 1 to 100. The threads should be synchronized to avoid any conflicts.
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
