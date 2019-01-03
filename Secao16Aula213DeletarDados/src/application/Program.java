package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class Program {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement st = null;

		try {

			conn = DB.getConnection();
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id= ?"
					 );
			st.setInt(1, 2);
		int rows = st.executeUpdate();
		System.out.println("Pronto, aletrado " + rows);
		}
		
		catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage()); 
		}
		
		finally {
					
			DB.closeStatement(st);
			DB.closeConnection();
		}
}
}