import java.util.Scanner;

// --------------------------------------------
// Fibonacci class implementing Runnable
// --------------------------------------------
class fibonacci implements Runnable
{
    int n;   // limit

    // Parameterized constructor
    fibonacci(int limit)
    {
        n = limit;
    }

    // run() method
    public void run()
    {
        int a = 0, b = 1, c;

        for(int i = 1; i <= n; i++)
        {
            System.out.println("Fibonacci: " + a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}


// --------------------------------------------
// Even class implementing Runnable
// --------------------------------------------
class Even implements Runnable
{
    int start, end;

    // Parameterized constructor
    Even(int a, int b)
    {
        start = a;
        end = b;
    }

    // run() method
    public void run()
    {
        for(int i = start; i <= end; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Even: " + i);
            }
        }
    }
}


// --------------------------------------------
// Main class
// --------------------------------------------
public class ThreadExample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Input Fibonacci limit
        System.out.print("Enter number of Fibonacci numbers: ");
        int n = sc.nextInt();

        // Input range for even numbers
        System.out.print("Enter start range: ");
        int start = sc.nextInt();

        System.out.print("Enter end range: ");
        int end = sc.nextInt();

        // Create Runnable objects
        fibonacci fib = new fibonacci(n);
        Even even = new Even(start, end);

        // Create Threads
        Thread f = new Thread(fib);
        Thread e = new Thread(even);

        // Start threads
        f.start();
        e.start();
    }
}