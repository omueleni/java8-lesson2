import yomisco.com.Message;

/**
 * Created by kogbe on 18/05/2018.
 */

public class ExpectionTesting {


    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String... args) {

        Message msg;

        try{

            msg = new Message("");
            String a = msg.getDesc();

        }catch (NullPointerException ex){
            System.out.println("PrintOut ln null pointer");
            try{

                int arg0 = Integer.parseInt(args[0]);
                int arg1 = Integer.parseInt(args[1]);
                System.out.println(divide(arg0, arg1));
            }catch (Exception ar){

            }


        }finally {

        }


    }
}