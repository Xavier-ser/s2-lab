import java.util.Scanner;

public class strManipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of string: " + str.length());

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);

        System.out.print("Enter character to check: ");
        char ch = sc.next().charAt(0);

        boolean found = false;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                found = true;
                count++;
            }
        }

        if (found) {
            System.out.println("Character found in the string.");
            System.out.println("Frequency of character: " + count);
        } else {
            System.out.println("Character not found in the string.");
        }

        sc.close();
    }
}
