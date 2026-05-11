import java.io.*;
import java.util.Scanner;

public class EvenOddSeparate {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("numbers.txt");
        File evenFile = new File("even.txt");
        File oddFile = new File("odd.txt");

        Scanner sc = new Scanner(inputFile);
        FileWriter evenWriter = new FileWriter(evenFile);
        FileWriter oddWriter = new FileWriter(oddFile);

        while (sc.hasNext()) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenWriter.write(num + " ");
            } else {
                oddWriter.write(num + " ");
            }
        }

        sc.close();
        evenWriter.close();
        oddWriter.close();

        System.out.println("Even and Odd numbers separated successfully.");
    }
}







import java.io.*;
import java.util.Scanner;

public class EvenOddSeparate {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("numbers.txt");
        File evenFile = new File("even.txt");
        File oddFile = new File("odd.txt");

        Scanner sc = new Scanner(inputFile);
        FileWriter evenWriter = new FileWriter(evenFile);
        FileWriter oddWriter = new FileWriter(oddFile);

        while (sc.hasNext()) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenWriter.write(num + " ");
            } else {
                oddWriter.write(num + " ");
            }
        }

        sc.close();
        evenWriter.close();
        oddWriter.close();

        System.out.println("Even and Odd numbers separated successfully.");
    }
}

// read file name from user

// import java.io.*;
// import java.util.Scanner;

// public class EvenOddSeparate {

//     public static void main(String[] args) throws IOException {

//         Scanner input = new Scanner(System.in);

//         // Read input file name from user
//         System.out.print("Enter input file name: ");
//         String inputFileName = input.nextLine();

//         // Read output file names from user
//         System.out.print("Enter even file name: ");
//         String evenFileName = input.nextLine();

//         System.out.print("Enter odd file name: ");
//         String oddFileName = input.nextLine();

//         File inputFile = new File(inputFileName);
//         File evenFile = new File(evenFileName);
//         File oddFile = new File(oddFileName);

//         // Scanner to read numbers from file
//         Scanner sc = new Scanner(inputFile);

//         // Writers for even and odd files
//         FileWriter evenWriter = new FileWriter(evenFile);
//         FileWriter oddWriter = new FileWriter(oddFile);

//         // Read numbers and separate
//         while (sc.hasNext()) {

//             int num = sc.nextInt();

//             if (num % 2 == 0) {
//                 evenWriter.write(num + " ");
//             } else {
//                 oddWriter.write(num + " ");
//             }
//         }

//         // Close all resources
//         sc.close();
//         evenWriter.close();
//         oddWriter.close();
//         input.close();

//         System.out.println("Even and Odd numbers separated successfully.");
//     }
// }
// Example:

// numbers.txt

// 10 15 22 7 8 13 40
// Input:

// Enter input file name: numbers.txt
// Enter even file name: even.txt
// Enter odd file name: odd.txt
// even.txt

// 10 22 8 40
// odd.txt

// 15 7 13

// TwinMind
// TwinMind

// Ask TwinMind
// Page icon
// Summarize
// Disable for this site
// Disable for all sites

// Save as PDF
