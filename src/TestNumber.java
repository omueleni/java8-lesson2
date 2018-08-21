



public class TestNumber {

	 enum ParsingErrorType {

			NO_DATA(true),
			MISSING_COLUMN(true),
			DUPLICATE_COLUMN(true),
			MISSING_REQUIRED,
			INCORRECT_FORMAT,
			INCORRECT_VALUE,
			DUPLICATE_VALUE,
			TO_VERIFY;
			
			/** Is this type of error always global? */
			private boolean global;
			
			/** Constructor setting global flag */
			private ParsingErrorType(boolean global) {
				this.global = global;
			}
			
			/** Creates a new non global type */
			private ParsingErrorType() {
				this(false);
			}

			public boolean isGlobal() {
				return global;
			}
	 }
	
	public static Integer integer(String number) {
		try {
			
			return Integer.valueOf(number);

		} catch(NumberFormatException exp) {
			System.out.println("Handling Exception");
			if (number.matches("^\\d*\\.[0]+")) {
				return integer(number.substring(0, number.indexOf(',')));

			} else {
				
				return 0;
			}
		}
	}
	

	private static boolean validateNumber (String number){
		    return number.contains(",");
	}
	
	private static int testInt(){
		return 500;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(integer("302,00"));
		System.out.println( "Number validation Returned " +  validateNumber("1921"));
		System.out.println( "Number validation Returned " +  validateNumber("1921,1"));
		
		if ( testInt() == 500){
			System.out.println("IT 500");
		}
		
	}
}
