import java.io.File;
import java.util.Scanner;

public class SearchFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String directoryPath = sc.nextLine();

        System.out.print("Enter file name to search: ");
        String fileName = sc.nextLine();

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            searchFile(directory, fileName);
        } else {
            System.out.println("Invalid directory path.");
        }

        sc.close();
    }

    public static void searchFile(File dir, String fileName) {

        File[] files = dir.listFiles();

        if (files == null) return;

        for (File file : files) {

            if (file.isDirectory()) {
                // Recursive call for subdirectory
                searchFile(file, fileName);
            } 
            else if (file.getName().equals(fileName)) {
                System.out.println("File found at: " + file.getAbsolutePath());
            }
        }
    }
}