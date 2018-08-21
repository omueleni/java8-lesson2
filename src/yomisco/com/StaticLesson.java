package yomisco.com;

/**
 * Created by kogbe on 17/05/2018.
 */
public class StaticLesson {

        static int count=0;

        public void increment()
        {  count++; }


        public static void main(String args[]) {
            StaticLesson obj1=new StaticLesson();

            StaticLesson obj2=new StaticLesson();

            obj1.increment();
            obj2.increment();

            System.out.println("Obj1: count is=  "+ obj1.count);
            System.out.println("Obj2: count is=  "+ obj2.count);
        }

}
