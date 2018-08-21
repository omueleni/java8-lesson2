/**
 * Created by kogbe on 16/05/2018.
 */

import java.lang.Integer;
public class TestMultiply {


    public static int countBits(int n){
        // Show me the code!
        String binaryString  = Integer.toBinaryString(n);
        char someChar = '1';
        int count = 0;

        //System.out.println("Incoming  " + n + " binary: " + binaryString);

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == someChar ) {
                count++;
            }
        }

        //System.out.println("Count is " + count);
        return count;
    }

    public static long countBits2(int n){
        // Show me the code!
        String binaryString  = Integer.toBinaryString(n);

        long count = binaryString.chars().filter(ch -> ch == 'e').count();

        return count;
    }
}