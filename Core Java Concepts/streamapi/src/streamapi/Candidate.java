package streamapi;

public class Candidate {
	
	String name;
	String techExp;
	String city;
	int yrOfExp;
	public Candidate(String name, String techExp, String city, int yrOfExp) {
	this.name = name;
	this.techExp = techExp;
	this.city = city;
	this.yrOfExp = yrOfExp;
	
	}
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	


}
