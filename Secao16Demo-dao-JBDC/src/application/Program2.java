package application;

import java.util.List;

import model.dal.DaoFactory;
import model.dal.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		
		DepartmentDao  departmentDao =  DaoFactory.createDepartmentDao();
		
		
		System.out.println("\n\n=== teste 1: seller insert======");
		Department newDepartment = new Department(null, "Vendas");
		
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserido new id: " + newDepartment.getId());
		
		System.out.println("\n\n=== teste 2: department update ======");
		
		Department dp = new Department(7,null); 
		dp.setName("Sapo");
		
		departmentDao.update(dp);
		System.out.println("Update com sucesso!!! ");
			
		
/*
		
		System.out.println("\n\n=== teste 3: seller delette  ======");		
		int n = ;		
		departmentDao.deleteById(n);
		System.out.println("Deletado !!!");
		*/
		
		
		System.out.println("\n\n=== teste 4: seller findAll ========");
		
		List<Department> list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		
				
		System.out.println("\n\n=== teste 5: seller findById======");
		Department dp1;
		dp1 = departmentDao.findById(7);
		
		System.out.println(dp);
		}
		
			
			
	}


