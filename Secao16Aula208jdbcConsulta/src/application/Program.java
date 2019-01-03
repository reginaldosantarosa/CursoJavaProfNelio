package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
	public static void main(String[] args) {

		//declarando conexao
		Connection conn = null; 
		
		//executa comando
		Statement st = null;
		
		//apresenta resultado
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();

			st = conn.createStatement();

			rs = st.executeQuery("select * from department");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//finalizando result
			DB.closeResultSet(rs);
			//finalizando Stantemednt
			DB.closeStatement(st);
			
			//finalizando Conection
			DB.closeConnection();
		}
		
	}
}
