package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static Connection getDBConnection(String cString) {
		Connection con = null;
		try {
			String className = PropertyUtil.getClassName("resouces\\training.properties");
			Class.forName(className);
			con = DriverManager.getConnection(cString,"root","Nipurna@123");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;

	}

	public static void main(String[] args) {
		String conStr = PropertyUtil.getConnectionString("resouces\\training.properties");
		Connection con = DBConnection.getDBConnection(conStr);
		String query = " select  * from employee where EmployeeID between 202 and 205";
		String query1 = " select  * from employee where EmployeeID between ? and ?";
		PreparedStatement ps =  null;
		ResultSet rs2 = null;
		try {
			
			ps = con.prepareStatement(query1);
			ps.setInt(1, 135);;
			ps.setInt(2, 145);
			rs2 = ps.executeQuery();
			
			while(rs2.next()) {
				System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getString(3));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				rs2.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		Statement s = null;
		ResultSet rs = null;
		try {
			s = con.createStatement();
			rs = s.executeQuery(query);

			while (rs.next()) {
				System.out.println(
						rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				rs.close();
				s.close();
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		} 
		
		
		System.out.println(con);

	}

}


//System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getDate(6)+" "+rs.getDouble("salary"));