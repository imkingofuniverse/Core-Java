package exceptionhandl;

public class ageexp extends Exception {
	

	public void ageexp(int age) {
		
		if(age>=18) {
			System.out.println("you are allowed to vote");
			}
		else {
			try {
				throw new ageexp();
			}
			catch(ageexp e) {
				System.out.println(age+" is not the appropriate age to vote");
			}
		
	}
	
	}
}
