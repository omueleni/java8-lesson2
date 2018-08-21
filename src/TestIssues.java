
public class TestIssues {
	
	 public enum Opinion { 
			
			NEGATIVE("Negative"),	
			OTHERS("Others"), 
			NEKEY("NEK"),
			OTKEY("OTK");
			
			public final String type;
			
			Opinion(String type){
				this.type = type;
			}
			
			public String getType() {
				return type;
			}
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Value is " + Opinion.NEGATIVE.name());
		System.out.println(" Type  is " + Opinion.NEGATIVE.getType());
		
		System.out.println("Calling Type " + getXPathFor("admindevice", "yomi"));

	}
	
	public static String getXPathFor(String listName, String type) {
		
		if (!(type.equalsIgnoreCase("human") || type.equalsIgnoreCase("vet") )) {
			
			System.out.println("incoming is " +  type);

			type = "all";
		}

		String xpath = type;
		
		//String xpath = eutctProperties.getProperty(listName + "-" + type);
		//if (xpath == null) {
			//xpath = eutctProperties.getProperty("common");
		//}
		
		//logger.info("Getting XPATH for: " +  listName  +  " - " + type + " - " + xpath);
		
		return xpath;
	}

}
