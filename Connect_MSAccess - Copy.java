import java.sql.*;

import net.ucanaccess.jdbc.*;

public class Connect_MSAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - Mukesh
		try
		{
			   Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:/JDBC-ODBC/Database1.accdb");
			   Statement stm = conn.createStatement();
			   ResultSet rs = stm.executeQuery("Select * From Table1");
			   while (rs.next())
			   {
				   System.out.println(rs.getString("Stu_Name"));
			   }

			   conn.close();
			   System.out.println("Connection Closed..Resources Released");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
