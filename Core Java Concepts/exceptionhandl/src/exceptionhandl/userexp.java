package exceptionhandl;

public class userexp extends Exception {
	
public void userexp(String username,int password) {
		
		if(username.contains("capgemini") && password==1) {
			System.out.println("valid user");
			}
		else {
			try {
				throw new userexp();
			}
			catch(userexp e) {
				System.out.println("Invalid credentials for username and password");
			}
		
		}
	
	}
	
	

}
