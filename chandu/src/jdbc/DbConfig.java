package jdbc;

import java.sql.*;

public class DbConfig 
{
	public static Connection connection() throws Exception
	{
		//h2
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/chandu","sa","sa");
		
		//oracle
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sa","sa");
		
		return con;
		
		
	}

}
