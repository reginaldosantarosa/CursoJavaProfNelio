package model.dal.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import model.dal.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class DepartmentDaoImplJDBC implements DepartmentDao {

	private Connection conn;

	public DepartmentDaoImplJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("INSERT INTO department " + "(Name) " + "VALUES " + " (?) ",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, obj.getName());

			int rowsAffect = st.executeUpdate();

			if (rowsAffect > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);

					DB.closeResultSet(rs);
				} else {
					throw new DbException("Erro inesperado, nenhuma linha foi criada!");
				}

			}
		}

		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

		finally {
			DB.closeStatement(st);
		}

	}

	public void update(Department obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement(" UPDATE department " + " SET Name = ?  WHERE Id = ? ");

			st.setString(1, obj.getName());
			st.setInt(2, obj.getId());

			st.executeUpdate();

		}

		catch (SQLException e) {

			throw new DbException(e.getMessage());
		}

		finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM department WHERE Id= ?");
			st.setInt(1, id);
			int rows = st.executeUpdate();
			if (rows == 0) {
				System.out.println("nada para deletar");
			}
		}

		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

		finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public Department findById(Integer id) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT department.*  FROM department WHERE Id = ? ");

			st.setInt(1, id);
			rs = st.executeQuery();

			// enquanto tiver linhas ou resultados....
			if (rs.next()) {
				Department obj = instantiateDepartement(rs);
				return obj;

			}
			return null;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

	}

	private Department instantiateDepartement(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt("Id"));
		dep.setName(rs.getString("Name"));
		return dep;
	}

	@Override
	public List<Department> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT *  FROM department ORDER BY Name ");

			rs = st.executeQuery();

			List<Department> list = new ArrayList<>();

			// pode ter um ou varios....
			while (rs.next()) {
				Department obj = instantiateDepartement(rs);
				list.add(obj);

			}
			return list;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

	}

}	
