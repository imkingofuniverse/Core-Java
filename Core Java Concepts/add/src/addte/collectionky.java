package addte;

import java.util.ArrayList;



class vaccine{
	
	int age;
	float dosage;

	public vaccine(int age) {
		
		this.age = age;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getDosage() {
		return dosage;
	}

	public void setDosage(float dosage) {
		this.dosage = dosage;
	}
	
	
	
	
	
}

 class vaccinationcamp{
	 
	 ArrayList<vaccine> list=new ArrayList<>();
	 void assignvaccine() {
		 
		
		 for(vaccine vac : list) {
			
			 if(vac.age>=45) {
				 vac.dosage=250;
			 }
			 else if(vac.age>=20) {
				 vac.dosage=200;
			 }
			 else if(vac.age<20) {
				 vac.dosage=100;
			 }
			 
			 System.out.println("age : "+vac.age+" dosage : "+vac.dosage);
			 
			}
		 
	 }
	 public float vaccineinjected() {
		
		 float sum=0;
		 for(vaccine v : list) {
			 sum=sum+v.dosage;
		 }
		 
		 return sum;
		 
	 }
	 
 }



public class collectionky {
	
	public static void main(String[] args) {
		
		vaccinationcamp vc=new vaccinationcamp();
		vc.list.add(new vaccine(49));
		vc.list.add(new vaccine(26));
		vc.list.add(new vaccine(19));
		vc.assignvaccine();
		
		float f = vc.vaccineinjected();
		System.out.println("vaccine injected : "+f);
		
		
		
	}

}
