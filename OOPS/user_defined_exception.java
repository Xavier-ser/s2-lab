import java.util.*;   // Import Scanner class

// -------------------------------------------------
// User-defined exception class
// This exception is thrown when a negative number is entered
// -------------------------------------------------
class NegativeException extends RuntimeException
{
    // Constructor to pass error message to parent class
    NegativeException(String message)
    {
        super(message);
    }
}


// -------------------------------------------------
// Main class
// -------------------------------------------------
class user_defined_exception
{
    public static void main(String args[])
    {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user how many numbers they want to enter
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();   // Read number of elements

        // Create integer array of size n
        int nos[] = new int[n];

        // Variable to store sum of positive numbers
        int sum = 0;

        try
        {
            // Loop to read n numbers
            for(int i = 0; i < n; i++)
            {
                System.out.print("Enter number " + (i+1) + ": ");
                nos[i] = sc.nextInt();   // Store number in array

                // Check if number is negative
                if(nos[i] < 0)
                {
                    // Throw user-defined exception if negative number found
                    throw new NegativeException("Negative number not allowed");
                }

                // If number is positive, add it to sum
                sum = sum + nos[i];
            }

            // Calculate average
            double average = (double) sum / n;

            // Display average
            System.out.println("Average = " + average);
        }

        // Catch block to handle negative number exception
        catch(NegativeException e)
        {
            // Display custom error message
            System.out.println(e.getMessage());
        }

        // Close scanner
        sc.close();
    }
}