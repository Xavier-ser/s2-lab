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