//creating a user defined array student and printing its values 

package arruserdefined;

public class estudent{
	
	public static void main(String[] args) {
		
		student s1=new student();
		student s2=new student();
		student s3=new student();
		student s4=new student();
		s1.id = 1; s2.id=2; s3.id=3; s4.id=4;
		s1.name="a"; s2.name="b"; s3.name="c"; s4.name="d";
		s1.rollno=1; s2.rollno=2; s3.rollno=3; s4.rollno=4;
		s1.subject="sub1"; s2.subject="sub2"; s3.subject="sub3"; s4.subject="sub4";
		System.out.println("Student ID:"+s1.id+"  Name:"+s1.name+"  Roll.No:"+s1.rollno+"  Subject:"+s1.subject);
		System.out.println("Student ID:"+s2.id+"  Name:"+s2.name+"  Roll.No:"+s2.rollno+"  Subject:"+s2.subject);
		System.out.println("Student ID:"+s3.id+"  Name:"+s3.name+"  Roll.No:"+s3.rollno+"  Subject:"+s3.subject);
		System.out.println("Student ID:"+s4.id+"  Name:"+s4.name+"  Roll.No:"+s4.rollno+"  Subject:"+s4.subject);
		
	}

}
