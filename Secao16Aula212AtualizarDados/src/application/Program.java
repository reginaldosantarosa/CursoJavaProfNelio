package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement st = null;

		try {

			conn = DB.getConnection();
			st = conn.prepareStatement(
					 "UPDATE seller "
					+ "SET BaseSalary=BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");
            
			st.setDouble(1,200.00);
			st.setInt(2, 2);
		int rows = st.executeUpdate();
		System.out.println("Pronto, aletrado " + rows);
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
					
			DB.closeStatement(st);
			DB.closeConnection();
		}
}
}