
public abstract class TestAbstract implements SendMailService {
		
	
	protected abstract void processEmail(String e) throws Exception;
	
	public void sendEmail(String message, String userId) throws Exception{
		
		processEmail(message);		
		createEmailLog(userId);
	
	}
	
	
	private void createEmailLog(String userId) throws Exception{	
		
		System.out.println(" TestAbstract User Id is " + userId);

	}
}
