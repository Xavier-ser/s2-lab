class Animal {  // Grandparent
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {  // Parent
    void walk() {
        System.out.println("Mammal is walking");
    }
}

class Dog extends Mammal {  // Child
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // from Animal
        d.walk();  // from Mammal
        d.bark();  // from Dog
    }
}

import java.util.Scanner;

// Step 1: Person class
class Person {
    String name, address, gender;
    int age;

    Person(String name, String address, String gender, int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }
}

// Step 2: Employee class
class Employee extends Person {
    int empId;
    String companyName, qualification;
    double salary;

    Employee(String name, String address, String gender, int age,
             int empId, String companyName, String qualification, double salary) {

        super(name, address, gender, age); // call Person constructor

        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Step 3: Teacher class
class Teacher extends Employee {
    String subject, department;
    int teacherID;

    Teacher(String name, String address, String gender, int age,
            int empId, String companyName, String qualification, double salary,
            String subject, String department, int teacherID) {

        super(name, address, gender, age, empId, companyName, qualification, salary);

        this.subject = subject;
        this.department = department;
        this.teacherID = teacherID;
    }

    // display method
    void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Emp ID: " + empId);
        System.out.println("Company: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherID);
    }
}

// Step 4: Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Teacher[] t = new Teacher[n];

        // Input loop
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Emp ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Company Name: ");
            String company = sc.nextLine();

            System.out.print("Qualification: ");
            String qual = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Teacher ID: ");
            int tid = sc.nextInt();
            sc.nextLine();

            t[i] = new Teacher(name, address, gender, age,
                               empId, company, qual, salary,
                               subject, dept, tid);
        }

        // Display loop
        System.out.println("\n=== Teacher Details ===");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}