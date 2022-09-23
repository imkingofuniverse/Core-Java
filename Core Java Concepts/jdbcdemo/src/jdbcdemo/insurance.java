package jdbcdemo;

public class insurance {
	
	private int insuranceid;
	private String insurancename;
	private String insurancetype;
	private int sumassured;
	
	public insurance(){
		
	}
	
	public insurance(int insuranceid, String insurancename, String insurancetype, int sumassured) {
		super();
		this.insuranceid = insuranceid;
		this.insurancename = insurancename;
		this.insurancetype = insurancetype;
		this.sumassured = sumassured;
	}

	public int getInsuranceid() {
		return insuranceid;
	}

	public void setInsuranceid(int insuranceid) {
		this.insuranceid = insuranceid;
	}

	public String getInsurancename() {
		return insurancename;
	}

	public void setInsurancename(String insurancename) {
		this.insurancename = insurancename;
	}

	public String getInsurancetype() {
		return insurancetype;
	}

	public void setInsurancetype(String insurancetype) {
		this.insurancetype = insurancetype;
	}

	public int getSumassured() {
		return sumassured;
	}

	public void setSumassured(int sumassured) {
		this.sumassured = sumassured;
	}

	@Override
	public String toString() {
		return "insurance [insuranceid=" + insuranceid + ", insurancename=" + insurancename + ", insurancetype="
				+ insurancetype + ", sumassured=" + sumassured + "]";
	}
	
	

}
