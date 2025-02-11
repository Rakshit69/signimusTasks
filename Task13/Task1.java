package Task13;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        //Create a text file and write random numbers to it.
        FileOutputStream fos = new FileOutputStream("file.txt");
        for (int i = 0; i < 10; i++) {
            fos.write(((i + 1) + "\n").getBytes());
        }
            fos.close();
        
    }
}
