package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class JdbcTwo {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","sa");
			Statement stm=con.createStatement();
			//String sql="create table student(sno number(6),sname varchar(20),course varchar(15))";
			
			int x=stm.executeUpdate("insert into student values(01,'abdul','dt')");
			
			
			//stm.executeUpdate(sql);
			System.out.println(x+"table created successfully");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("error: "+e);
		}

	}

}
