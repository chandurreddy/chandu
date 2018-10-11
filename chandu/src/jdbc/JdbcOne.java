package jdbc;


import java.sql.*;
import java.sql.DriverManager;

//import org.h2.Driver;

public class JdbcOne {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","sa");
			Statement stm=con.createStatement();
			String sql="create table student(sno number(6),sname varchar(20),course varchar(15))";
			stm.executeUpdate(sql);
			System.out.println("table created successfully");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("error: "+e);
		}
		}
}



