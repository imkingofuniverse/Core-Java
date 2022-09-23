package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class insertmultipledata {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost/capgemini";
			String userName="postgres";
			String password="superuser@123";
			

			Connection conn= DriverManager.getConnection(url, userName, password);
			System.out.println("Connected to DB successfully...");
			
			String insertquery = "insert into employee values(?,?,?,?)";
			PreparedStatement ps =conn.prepareStatement(insertquery);
			
			employee e1=new employee(1008,"Ross", "Paleontologist", 70000);
			employee e2=new employee(1009,"Rachel", "Fashion Designer", 60000);
			employee e3=new employee(1010,"Monica", "Chef", 55000);
			employee e4=new employee(1011,"Chandler", "Static data Analyzer", 88000);
			employee e5=new employee(1012,"Joey", "Actor", 65000);
			employee e6=new employee(1013,"Phoebe", "Musician", 45000);

			ArrayList<employee> emplist=new ArrayList<employee>();
			emplist.add(e1);
			emplist.add(e2);
			emplist.add(e3);
			emplist.add(e4);
			emplist.add(e5);
			emplist.add(e6);
			
			
			for(employee emp : emplist)
			{
				ps.setInt(1, emp.getEmpid());
				ps.setString(2, emp.getName());
				ps.setString(3, emp.getDesignation());
				ps.setInt(4, emp.getSalary());
				System.out.println(ps.toString());
				ps.execute();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
