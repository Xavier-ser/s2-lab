import java.io.*;

public class CopyFile {

        public static void main(String[] args) throws IOException {

        File source = new File("source.txt");
        File destination = new File("destination.txt");

        FileReader fr = new FileReader(source);
        FileWriter fw = new FileWriter(destination);

        int ch;

        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close(); 
        fw.close();

        System.out.println("File copied successfully.");
    }
}