package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;

public class Program {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		Statement st = null;
		
		
		try {

			conn = DB.getConnection();
		
			conn.setAutoCommit(false); // nao confirma
			
			
			st = conn.createStatement();
		int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary=2000 WHERE DepartmentId = 1 ");
		
		//int x=1;
		//if (x<2) {
		//	throw new SQLException("Fake error  ");
		//}
		int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary=3900 WHERE DepartmentId = 2 ");
		
		
		conn.commit();   // agora sim ele faz tudo
		
		System.out.println("rows1 " + rows1);
		System.out.println("rows2 " + rows2);
		}
		
		catch (SQLException e) {
			try {
				conn.rollback();// volta para estado normal do banco 
				throw new DbException("Erro por causa de " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro por causa de rollback!!! " + e.getMessage());
			} 
			
		}
		
		finally {
					
			DB.closeStatement(st);
			DB.closeConnection();
		}
}
}