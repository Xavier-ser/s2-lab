import java.util.Scanner;

public class ArrayOfObjects {

	static class Student {
		String name;
		int roll;
		double marks;

		Student(String name, int roll, double marks) {
			this.name = name;
			this.roll = roll;
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Name: " + name + ", Roll: " + roll + ", Marks: " + marks;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = 0;
		try {
			n = Integer.parseInt(sc.nextLine().trim());
		} catch (Exception e) {
			System.out.println("Invalid number. Exiting.");
			sc.close();
			return;
		}

		if (n <= 0) {
			System.out.println("No students to process.");
			sc.close();
			return;
		}

		Student[] students = new Student[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nStudent " + (i + 1) + ":");
			System.out.print("  Name: ");
			String name = sc.nextLine().trim();
			System.out.print("  Roll (int): ");
			int roll = Integer.parseInt(sc.nextLine().trim());
			System.out.print("  Marks (double): ");
			double marks = Double.parseDouble(sc.nextLine().trim());
			students[i] = new Student(name, roll, marks);
		}

		System.out.println("\nEntered students:");
		for (Student s : students) {
			System.out.println(s);
		}

		sc.close();
	}
}
