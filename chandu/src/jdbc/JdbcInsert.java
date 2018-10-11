
package jdbc;

import java.sql.*;

public class JdbcInsert 
{

	public static void main(String[] args) 
	{
		try
		{
			Connection con=DbConfig.connection();
			Statement st=con.createStatement();
			st.executeUpdate("insert into niit values(001,'chandu','java',45000,'30-12-2018')");
			st.executeUpdate("insert into niit values(002,'abdul','dtsingle',45000,'30-01-2019')");
			st.executeUpdate("insert into niit values(003,'srvya','dtsingle',45000,'30-12-2018')");
			System.out.println("success");
			con.close();
			
		}
		catch(Exception e)
		{
			
		}
	}

}
