import java.util.Arrays;

public class SortStringsExample {
    public static void main(String[] args) {
        String[] names = {"Zara", "Alex", "John", "Bella"};

        // --- Ascending Order ---
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) { // swap if out of order
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;        
                }
            }
        }

        // Print sorted array in ascending order
        System.out.println("Ascending order:");
        for (String name : names) {
            System.out.println(name);
        }

        // --- Descending Order ---
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) < 0) { // swap for descending
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // Print sorted array in descending order
        System.out.println("\nDescending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}