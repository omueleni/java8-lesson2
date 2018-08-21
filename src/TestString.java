import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;



public class TestString {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date datenow = new Date();
		Format dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		
		final String DATE_CREATED_PARAM = "datecreated1_qo=on&datecreated1_date=%s&datecreated2_qo=after&datecreated2_date=%s";
		
		String dateQuery = String.format(DATE_CREATED_PARAM, dateFormatter.format(datenow),dateFormatter.format(datenow));
		
		System.out.println(dateQuery);
		

	}

}
