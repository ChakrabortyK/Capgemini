import java.io.File;
import java.io.IOException;

public class FileHandling extends Thread{
    public static void main(String[] args) {

        
        
        // FileHandling fh = new FileHandling();
        // Thread t = new Thread(fh);

        File obj = new File("./test.txt"); 
        try {
            System.out.println(obj.createNewFile());
        } catch (IOException ex) {
            System.getLogger(FileHandling.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }


        try {
            sleep(5000);
        } catch (InterruptedException ex) {
            System.getLogger(FileHandling.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }



        obj.deleteOnExit();
    }
}
