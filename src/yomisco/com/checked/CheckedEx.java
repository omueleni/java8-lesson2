package yomisco.com.checked;
import java.io.*;


/**
 * Created by kogbe on 15/06/2018.
 */
public class CheckedEx {


    /**
     * Throws IOException to catch  the checked exception from
     */

    public static void main(String[] args) throws IOException{
            FileReader file = new FileReader("C:\\test\\a.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

            fileInput.close();
        }

}
