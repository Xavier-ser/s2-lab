import java.util.Scanner;

// Step 1: Custom Exceptions
class nameexception extends RuntimeException {
    nameexception(String msg) {
        super(msg);
    }
}

class passexception extends RuntimeException {
    passexception(String msg) {
        super(msg);
    }
}

// Step 2: User class
class user {
    String name;
    String password;

    // Step 3: Constructor
    user(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Step 4: Login method
    void login(String uname, String pass) {
        if (name.equals(uname) && password.equals(pass)) {
            System.out.println("Login Successful");
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }
}

// Step 5: Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Name input + validation
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            for (int i = 0; i < name.length(); i++) {
                if (!Character.isLetter(name.charAt(i))) {
                    throw new nameexception("Invalid name: Only alphabets allowed");
                }
            }

            // Password input + validation
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.length() < 8) {
                throw new passexception("Password must be at least 8 characters");
            }

            boolean hasDigit = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }

            if (!hasDigit) {
                throw new passexception("Password must contain at least 1 digit");
            }

            // Step 6: Create user
            user u = new user(name, password);

            // Step 7: Login input
            System.out.print("\nEnter login username: ");
            String uname = sc.nextLine();

            System.out.print("Enter login password: ");
            String pass = sc.nextLine();

            // Step 8: Login check
            u.login(uname, pass);

        } catch (nameexception e) {
            System.out.println(e.getMessage());
        } catch (passexception e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}