import java.util.Scanner;

// --------------------------------------------
// User-defined Exception Class
// --------------------------------------------
class NegativeException extends RuntimeException
{
    NegativeException(String message)
    {
        super(message);
    }
}

// --------------------------------------------
// Main Class
// --------------------------------------------
public class user_defined_exception
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nos = new int[n];
        int sum = 0;
        int i = 0;

        // Loop until n valid numbers are entered
        while(i < n)
        {
            try
            {
                System.out.print("Enter number " + (i+1) + ": ");
                int num = sc.nextInt();

                if(num < 0)
                {
                    throw new NegativeException("Negative number not allowed. Please re-enter.");
                }

                nos[i] = num;
                sum += num;
                i++;   // move to next index only if valid
            }
            catch(NegativeException e)
            {
                System.out.println(e.getMessage());
            }
        }

        double average = (double) sum / n;

        System.out.println("Average = " + average);

        sc.close();
    }
}