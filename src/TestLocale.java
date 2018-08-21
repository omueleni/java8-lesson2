




public class TestLocale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (contains("da")) 
			 System.out.println("Contai English");
		else
			 System.out.println("Failed");
		
		
		
		System.out.println(" " + testDomain(100000000012L));
			

	}
	
	
	public static String testDomain(Long id){
		
		
		return id.equals(Domain.H.getDomainId()) ? "H" : "V"; 
	}
	
	
	public static boolean contains(String test) {

	    for (Locale c : Locale.values()) {

	    	if (c.getLanguageCode().equals(test)){
	    		return true;
	    	}
	    }

	    return false;
	}
	
	enum Locale {

	    EN("en"),
	    PT("pt"),
	    CS("cs"),
	    ES("es"),
	    LT("lt"),
	    DA("da"),
	    EL("el"),
	    FI("fi"),
	    NL("nl"),
	    FR("fr"),
	    LA("la"),
	    PL("pl"),
	    HU("hu"),
	    IS("is"),
	    NO("no"),
	    SK("sk"),
	    SL("sl"),
	    BG("bg"),
	    HR("hr"),
	    DE("de"),
	    IT("it"),
	    RO("ro"),
	    SV("sv"),
	    ET("et"),
	    LV("lv"),
	    MT("mt");

	    public final String languageCode;

	    Locale(String languageCode){
	        this.languageCode = languageCode;
	    }

	    public String getLanguageCode() {
	        return languageCode;
	    }

	}
	
	enum Domain {	
		H (100000000012L),
		V (100000000013L),
		H_V(100000000014L);
		
		public final Long domainId;
		
		Domain(Long domainId){
	        this.domainId = domainId;
	    }
		
		public Long getDomainId() {
	        return domainId;
	    }
		
	}
	
	
	

}
