import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead extends Thread {
    public static void main(String[] args) {

        File fileObj = new File("./test.txt");


        try {

            FileInputStream freader = new FileInputStream(fileObj);

            int c;
            while ((c = freader.read()) != -1) {
                System.out.print((char)c);
            }

        } catch (IOException ex) {
            System.getLogger(FileHandling.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        // obj.deleteOnExit();
    }
}
