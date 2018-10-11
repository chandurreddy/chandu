package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcThree {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/chandu","sa","sa");
			Statement st=con.createStatement();
			st.executeUpdate("create table niit(sno number(4),sname varchar(30),course varchar(15),fee double,expdate varchar2(50))");
			System.out.println("success");
			st.close();
		}
		catch(Exception e)
		{
			System.out.println("error:" +e);
		}

	}

}
