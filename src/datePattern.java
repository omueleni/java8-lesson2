
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class datePattern {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String DATE_FORMAT_PATTERN_YYYY_MM_DD = "yyyy-MM-dd";
		
		String dateToFormat = "20161022010000z";
		
		
		SimpleDateFormat stdDateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN_YYYY_MM_DD);
		
		
		String year  = dateToFormat.substring(0,4);
		String month = dateToFormat.substring(4,6);
		String day   = dateToFormat.substring(6,8);
		
		System.out.println(year+"-"+month+"-"+day);
				
	try {	
		Date dateString = stdDateFormat.parse(year+"-"+month+"-"+day);
		System.out.println(dateString);
	}catch(ParseException ex){
		
	}
		
		

	}
	

}
