import java.util.Arrays;
import java.util.Collections;

public class SortStrings {
    public static void main(String[] args) {
        String[] names = {"Zara", "Alex", "John", "Bella"};

        Arrays.sort(names); 
        // Arrays.sort(names, Collections.reverseOrder());

        System.out.println("Sorted names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}