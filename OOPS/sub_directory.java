import java.io.File;
import java.util.Scanner;

public class DirectoryListing {

    // Step 2: List files and directories (recursive)
    static void listFilesAndDirectories(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());

                if (file.isDirectory()) {
                    listFilesAndDirectories(file); // recursive call
                }
            }
        }
    }

    // Step 3: Search file (recursive)
    static boolean searchFile(File directory, String fileName) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {

                if (file.getName().equals(fileName)) {
                    System.out.println("Found at: " + file.getAbsolutePath());
                    return true;
                }

                if (file.isDirectory()) {
                    boolean found = searchFile(file, fileName);
                    if (found) return true;
                }
            }
        }
        return false;
    }

    // Step 4: Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read directory path
        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File directory = new File(path);

        // Validate directory
        if (directory.exists() && directory.isDirectory()) {

            System.out.println("\nFiles and Directories:");
            listFilesAndDirectories(directory);

            // Search file
            System.out.print("\nEnter file name to search: ");
            String fileName = sc.nextLine();

            boolean result = searchFile(directory, fileName);

            if (!result) {
                System.out.println("File not found");
            }

        } else {
            System.out.println("Invalid directory path");
        }

        sc.close();
    }
}