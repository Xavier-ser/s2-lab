class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // inherited from Animal
        d.bark();  // defined in Dog
    }
}



import java.util.Scanner;

// Step 1: Employee class
class Employee {
    int empid;
    String name;
    String address;
    double salary;

    Employee(int empid, String name, String address, double salary) {
        this.empid = empid;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}

// Step 2: Teacher class
class Teacher extends Employee {
    String dept;
    String[] subject;
    int no; // number of subjects

    Teacher(int empid, String name, String address, double salary,
            String dept, String[] subject, int no) {

        // call superclass constructor
        super(empid, name, address, salary);

        this.dept = dept;
        this.subject = subject;
        this.no = no;
    }

    // display method
    void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + dept);

        System.out.print("Subjects: ");
        for (int i = 0; i < no; i++) {
            System.out.print(subject[i] + " ");
        }
        System.out.println();
    }
}

// Step 3: Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Teacher[] t = new Teacher[n];

        // input loop
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Emp ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Number of subjects: ");
            int no = sc.nextInt();
            sc.nextLine();

            String[] subjects = new String[no];
            for (int j = 0; j < no; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                subjects[j] = sc.nextLine();
            }

            t[i] = new Teacher(id, name, address, salary, dept, subjects, no);
        }

        // display loop
        System.out.println("\n=== Teacher Details ===");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}