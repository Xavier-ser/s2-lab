import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    // Constructor to initialize values
    Employee(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        eNo = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Employee Name: ");
        eName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        eSalary = sc.nextDouble();
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class array_obj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 3: number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Step 4: create array
        Employee[] e = new Employee[n];

        // Step 5: initialize objects
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            e[i] = new Employee(sc);
        }

        // Step 6: search employee number
        System.out.print("\nEnter employee number to search: ");
        int num = sc.nextInt();

        boolean found = false;

        // Step 7: search loop
        for (int i = 0; i < n; i++) {
            if (e[i].eNo == num) {
                System.out.println("\nEmployee Found:");
                e[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Registered!!!");
        }

        sc.close();
    }
}