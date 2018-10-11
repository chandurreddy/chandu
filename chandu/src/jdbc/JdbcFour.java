package jdbc;

import java.sql.*;


public class JdbcFour 
{

	public static void main(String[] args) 
	{
		try
		{
			Connection con=DbConfig.connection();
			Statement st=con.createStatement();
			st.executeUpdate("create table stdet(srno varchar2(5),stname varchar2(20),psprtno varchar2(20))");
			System.out.println("hehehe");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("error:" +e);
		}
	}

}
