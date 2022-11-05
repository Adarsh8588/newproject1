package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class ReadDataFromDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	
		
			Driver driver = new Driver();
			//step1:register to database
			DriverManager.registerDriver(driver);
			//step2:get connection for database
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms1", "root","root");
			//step3:issue create statement
			Statement stat = con.createStatement();
			String query = "select * from create_package";
			//step4:executequery
			ResultSet result = stat.executeQuery(query);
			while(result.next())
			{for(int i=1;i<6;i++)
			System.out.print(result.getString(i)+" ");
			}
	

		con.close();
		
	}

}
