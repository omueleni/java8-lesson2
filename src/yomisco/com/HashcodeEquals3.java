package yomisco.com;

import java.util.HashSet;

/**
 * Created by kogbe on 13/06/2018.
 */


    public class HashcodeEquals3 {
        public static void main(String[] args) {
            StudentEqualPattern alex1 = new StudentEqualPattern(1, "Alex");
            StudentEqualPattern alex2 = new StudentEqualPattern(1, "Alex");
            HashSet< StudentEqualPattern > students = new HashSet < StudentEqualPattern > ();
            students.add(alex1);
            students.add(alex2);
            System.out.println("HashSet size = " + students.size());
            System.out.println("HashSet contains Alex = " + students.contains(new StudentEqualPattern(1, "Alex")));
        }
    }


