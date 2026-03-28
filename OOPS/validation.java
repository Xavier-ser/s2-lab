import java.util.*;   // Import Scanner class for user input

// --------------------
// User-defined exception for invalid name
// --------------------
class nameexception extends RuntimeException 
{ 
    // Constructor that passes error message to parent class
    nameexception(String s) 
    { 
        super(s); 
    } 
} 

// --------------------
// User-defined exception for invalid password
// --------------------
class passexception extends RuntimeException 
{ 
    passexception(String s) 
    { 
        super(s); 
    } 
} 


// --------------------
// User class for storing username and password
// --------------------
class user 
{ 
    String name, password;   // Instance variables

    // Constructor to initialize username and password
    user(String n, String p) 
    { 
        name = n; 
        password = p; 
    } 

    // Method to check login credentials
    void login(String n, String p) 
    { 
        try 
        { 
            // Compare stored username & password with entered values
            if(name.equals(n) && password.equals(p)) 
                System.out.println("\t\tLogin successful"); 
            else 
                // Throw exception if credentials are wrong
                throw new passexception("Invalid username or password!!"); 
        } 
        catch (passexception e) 
        { 
            // Print error message
            System.out.println("\n" + e.getMessage()); 
            System.exit(0);   // Terminate program
        } 
    } 
} 


// --------------------
// Main class
// --------------------
class validation 
{ 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in);   // Create Scanner object

        // --------------------
        // NAME VALIDATION
        // --------------------
        System.out.print("Enter name: "); 
        String s = sc.next();   // Read username

        try 
        { 
            // Check each character of name
            for(int i = 0; i < s.length(); i++) 
            { 
                char ch = s.charAt(i); 

                // Check if character is alphabet (A-Z or a-z)
                if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) 
                    continue;   // Valid character → continue checking
                else 
                    // Throw exception if invalid character found
                    throw new nameexception("Invalid Name"); 
            } 
        } 
        catch (nameexception e) 
        { 
            System.out.println("\n" + e.getMessage()); 
            System.exit(0); 
        } 

        // --------------------
        // PASSWORD VALIDATION
        // --------------------
        System.out.print("Enter password: "); 
        String pass = sc.next(); 

        try 
        { 
            int digitFlag = 0;   // To check if at least one digit exists

            // Check minimum length
            if(pass.length() < 8) 
                throw new passexception("Password must have 8 characters"); 

            // Check each character for digit (0–9)
            for(int i = 0; i < pass.length(); i++) 
            { 
                char ch = pass.charAt(i); 

                if(ch >= 48 && ch <= 57)   // ASCII for digits
                { 
                    digitFlag = 1; 
                } 
            } 

            // If no digit found
            if(digitFlag == 0) 
                throw new passexception("Password must contain atleast 1 number"); 
        } 
        catch (passexception e) 
        { 
            System.out.println("\n" + e.getMessage()); 
            System.exit(0); 
        } 

        // --------------------
        // Create user object with validated data
        // --------------------
        user u1 = new user(s, pass); 

        // --------------------
        // LOGIN AUTHENTICATION
        // --------------------
        System.out.println("\t\tLogin!!"); 

        System.out.print("Username: "); 
        String n1 = sc.next(); 

        System.out.print("Password: "); 
        String p1 = sc.next(); 

        // Call login method
        u1.login(n1, p1); 
    } 
}