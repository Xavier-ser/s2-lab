import java.io.*;

public class file_read_write {
    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");

        FileWriter fw = new FileWriter(file);
        fw.write("Java File Handling Example\n");
        fw.write("Reading and Writing without try-catch.");
        fw.close();

        System.out.println("Data written successfully.\n");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;

        System.out.println("Reading file content:\n");

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        fr.close();
    }
}