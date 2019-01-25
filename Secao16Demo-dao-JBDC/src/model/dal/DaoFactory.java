package model.dal;

import db.DB;
import model.dal.impl.DepartmentDaoImplJDBC;
import model.dal.impl.SellerDaoImplJDBC;

//cria fabrica de atraves da interface 
// neste caso, quando mudar o banco,nao precisa mudar todos
//os codigos que criavam SellerDaoImpleJDBC

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoImplJDBC(DB.getConnection());
	}

	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoImplJDBC(DB.getConnection());
	}

}
