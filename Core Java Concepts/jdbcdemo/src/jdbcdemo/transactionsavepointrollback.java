package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class transactionsavepointrollback {
	
	private static Connection conn;
	private static Savepoint sp;
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost/capgemini";
			String userName="postgres";
			String password="superuser@123";
			

			conn= DriverManager.getConnection(url, userName, password);
			System.out.println("Connected to DB successfully...");
			
			conn.setAutoCommit(false);
			
			employee amy=new employee(1015, "Amy", "Microbiologist", 100000);
			insurance vidal=new insurance(2001, "Vidal Insurance", "Term", 5000000);
			
			String insertemployee="insert into employee values(?,?,?,?)";
			String insertinsurance="insert into insurance values(?,?,?,?,?)";
			
			
			PreparedStatement psemp =conn.prepareStatement(insertemployee);
			PreparedStatement psins =conn.prepareStatement(insertinsurance);
			
			psemp.setInt(1, amy.getEmpid());
			psemp.setString(2, amy.getName());
			psemp.setString(3, amy.getDesignation());
			psemp.setInt(4, amy.getSalary());
			System.out.println(psemp);
			psemp.execute();
			sp=conn.setSavepoint("SavePoint1");
			
			
			psins.setInt(1, vidal.getInsuranceid());
			psins.setInt(2, amy.getEmpid());
			psins.setString(3, vidal.getInsurancename());
			psins.setString(4, vidal.getInsurancetype());
			psins.setInt(5, vidal.getSumassured());
			System.out.println(psins);
			psins.execute();

			conn.commit();
			System.out.println("Transaction successful...");
			//conn.close();
			
			
		} catch (ClassNotFoundException|SQLException e) {
			System.out.println("Exception Occurred..!!"+e);
			System.out.println("Rolling back the transaction...");
			
			conn.rollback(sp);
			conn.commit();
			conn.close();
			
		}
		
	}

}
