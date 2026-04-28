import java.util.Scanner;

// Step 1: Custom Exception
class negative extends RuntimeException {
    negative(String msg) {
        super(msg);
    }
}

// Step 2: Main class
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 3: number of elements
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            // Step 4: array creation
            int[] nos = new int[n];

            // Step 5: sum variable
            int sum = 0;

            // Step 6: input numbers
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                nos[i] = sc.nextInt();

                if (nos[i] < 0) {
                    throw new negative("Negative number not allowed");
                }

                sum += nos[i];
            }

            // Step 7: average
            double avg = (double) sum / n;
            System.out.println("Average = " + avg);

        } catch (negative e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}