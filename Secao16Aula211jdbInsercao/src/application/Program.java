package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement st = null;

		try {

			conn = DB.getConnection();
            /*
			st = conn.prepareStatement("INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES " + "(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS // retona os id das linhas criadas
					);

			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.00);
			st.setInt(5, 4);
             */
			
			st = conn.prepareStatement(
					 "insert into department (Name) values ('D1'),('D2')",
					 Statement.RETURN_GENERATED_KEYS);
			int rowsAffect = st.executeUpdate();
			
			if (rowsAffect>0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					
					int id= rs.getInt(1); // coluna 1 do vetor retornado
					System.out.println("Pronto id : " + id);
				}
			}
			else
			{
				System.out.println("nenuma linha afetada");
			}

			
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		//catch (ParseException e) {
		//	e.printStackTrace();
	//	}

		finally {

			DB.closeStatement(st);
			DB.closeConnection();
		}

	}
}
