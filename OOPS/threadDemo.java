import java.util.*;

// --------------------------------------------------
// Thread 1: Generate multiplication table of 5
// --------------------------------------------------
class multiple5 extends Thread
{
    // Override run() method (contains code executed by thread)
    public void run()
    {
        // Loop from 1 to 10
        for(int i = 1; i <= 10; i++)
        {
            // Print multiplication of 5
            System.out.println("5 x " + i + " = " + (5 * i));

            try
            {
                // Sleep for 500 milliseconds
                // (just to show parallel execution clearly)
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}


// --------------------------------------------------
// Thread 2: Generate first N prime numbers
// --------------------------------------------------
class Prime extends Thread
{
    int n;   // Limit up to which prime numbers are generated

    // Parameterized constructor
    Prime(int limit)
    {
        n = limit;
    }

    // Method to check whether a number is prime
    int isprime(int num)
    {
        // 1 is not prime
        if(num <= 1)
            return 0;

        // Check divisibility from 2 to num/2
        for(int i = 2; i <= num/2; i++)
        {
            if(num % i == 0)
                return 0;   // Not prime
        }

        return 1;   // Prime
    }

    // Override run() method
    public void run()
    {
        System.out.println("Prime numbers up to " + n + " are:");

        // Loop from 1 to n
        for(int i = 1; i <= n; i++)
        {
            // Check if number is prime
            if(isprime(i) == 1)
            {
                System.out.println(i);
            }

            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}


// --------------------------------------------------
// Main Class
// --------------------------------------------------
class threadDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Create object of multiple5 thread
        multiple5 m = new multiple5();

        // Ask user to enter limit for prime numbers
        System.out.print("Enter limit for prime numbers: ");
        int limit = sc.nextInt();

        // Create object of Prime thread
        Prime m1 = new Prime(limit);

        // Start both threads
        m.start();    // Starts multiplication thread
        m1.start();   // Starts prime thread

        sc.close();
    }
}