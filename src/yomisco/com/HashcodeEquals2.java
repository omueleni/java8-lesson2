package yomisco.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kogbe on 13/06/2018.
 */


    public class HashcodeEquals2 {
        public static void main(String[] args) {
            StudentEqualPattern alex = new StudentEqualPattern(1, "Alex");
            List< StudentEqualPattern > studentsLst = new ArrayList< StudentEqualPattern >();
            studentsLst.add(alex);
            System.out.println("Arraylist size = " + studentsLst.size());
            System.out.println("Arraylist contains Alex = " + studentsLst.contains(new StudentEqualPattern(1, "Alex")));
        }
    }

