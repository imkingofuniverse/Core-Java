package postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class postgresqlconnect {
	
	public static void main(String... param) throws SQLException, ClassNotFoundException{
		
		//url:jdbc:postgresql://localhost:5432/test   user:postgres  password:superuser@123
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "superuser@123");
		
		if(conn!=null)
		{
			System.out.println("database connected");
		}
		else
		{
			System.out.println("database not connected");
		}
		
		Statement stmt = conn.createStatement();
		
		String sql = "create table elevate(id int primary key not null, name text not null, age int not null, "+ "address char(50), salary real)";
		
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();
		
	}

}
