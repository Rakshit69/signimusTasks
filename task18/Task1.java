package task18;
//Singleton: Create a thread-safe Singleton class Logger with a log(String message) method to print messages with a timestamp.
class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

public class Task1 {
    public static void main(String[] args) {
        
    }
}

//Enum: Define an enum UserRole with roles ADMIN, USER, and GUEST, and print access levels based on the role.
enum UserRole {
    ADMIN("Admin", true),
    USER("User", false),
    GUEST("Guest", false);

    UserRole(String a,boolean accessLevel) {
        System.out.println("Access level: " + accessLevel);

    }

}