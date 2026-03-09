import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferRead {
    public static void main(String[] args) {

        String fileName = "test.txt";
        String line = null;
        File obj = new File("./pasted.txt"); 


        try {
            obj.createNewFile();

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(obj);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            while ((line = bufferedReader.readLine()) != null) {
                // System.out.println(line);
                bufferedWriter.write(line);
            }

            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

    }
}
