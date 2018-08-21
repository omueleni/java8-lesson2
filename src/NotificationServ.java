import java.security.InvalidKeyException;
import java.security.NoSuchProviderException;

public class NotificationServ extends TestAbstract {

	//Implement you own send mail service
	//Since it is only available to this class Encapsulate it by protected access right
	@Override
	protected void processEmail(String e) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside NotificationServ  "  + e);
	}

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		NotificationServ note =  new NotificationServ();
		note.sendEmail("This is the Message", "kogbe"); // Inherit sendEmail from Parent
	}
	
	
}
