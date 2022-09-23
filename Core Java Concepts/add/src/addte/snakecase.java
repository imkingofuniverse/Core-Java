package addte;

public class snakecase {
	public String camel;
	public void camelto(String camel) {
		
		this.camel=camel;
		
		String result = "";
		char c = camel.charAt(0);
        result = result + Character.toLowerCase(c);
        for (int i = 1; i < camel.length(); i++) {
        	 
            char ch = camel.charAt(i);
            if (Character.isUpperCase(ch)) {
                result = result + '_';
                result
                    = result
                      + Character.toLowerCase(ch);
            }
            else {
                result = result + ch;
            }
        }
        System.out.println(result);
		
	}

}
