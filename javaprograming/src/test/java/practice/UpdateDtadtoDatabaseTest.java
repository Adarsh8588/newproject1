package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class UpdateDtadtoDatabaseTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	
		
			Driver driver = new Driver();
			//step1:register to database
			DriverManager.registerDriver(driver);
			//step2:get connection for database
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms1", "root","root");
			//step3:issue create statement
			Statement stat = con.createStatement();
			String query = "insert into create_package values('mysore','goodtrip','india',6989,'trip')";
			String query1 = "ALTER TABLE create_package CHANGE COLUMN price  usdprice INTEGER(30)";
			//step4:executequery
			 int result = stat.executeUpdate(query);
			 stat.executeUpdate(query1);
			
	if(result==1)
	{
		System.out.println("project inserted sucessfully");
	}
	else
	{
		System.out.println("project inserted sucessfully");
	}

		con.close();
		
	}

}
