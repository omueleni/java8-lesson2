package yomisco.com;

/**
 * Created by kogbe on 13/06/2018.
 */


    public class HashcodeEquals {
        public static void main(String[] args) {
            StudentEqualPattern alex1 = new StudentEqualPattern(1, "Alex");
            StudentEqualPattern alex2 = new StudentEqualPattern(1, "Alex");
            System.out.println("alex1 hashcode = " + alex1.hashCode());
            System.out.println("alex2 hashcode = " + alex2.hashCode());
            System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
        }
    }


