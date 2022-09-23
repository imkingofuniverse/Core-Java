package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updatequery {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost/capgemini";
			String userName="postgres";
			String password="superuser@123";
			

			Connection conn= DriverManager.getConnection(url, userName, password);
			System.out.println("Connected to DB successfully...");
			
			Statement stat =conn.createStatement();
			
	/*		String query1= "insert into employee values(1005, 'Amar', 'Manager', 80000)";
			String query2= "insert into employee values(1006, 'Akbar', 'Manager', 80000)";
			String query3= "insert into employee values(1007, 'Anthony', 'Manager', 80000)";
			stat.execute(query1);
			stat.execute(query2);
			stat.execute(query3);
			System.out.println("Inserted into DB successfully...");               */
			
			String updatequery="update employee set designation='HR Manager', salary=75000 where emp_ID=1006";
			stat.executeUpdate(updatequery);
			
			String query= "select * from employee";
			ResultSet rs= stat.executeQuery(query);
			System.out.println("\n--Employee Details--\n");
			
			while(rs.next())
			{
				int empid=rs.getInt("emp_ID");
				String name=rs.getString("name");
				String designation=rs.getString("designation");
				int salary = rs.getInt ("salary");
				System.out.println("EmpID:"+empid+" Name:"+name+" Designation: "+designation+" Salary:"+salary);
			}
			
			
			stat.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
