package application;

import java.util.Date;
import java.util.List;

import model.dal.DaoFactory;
import model.dal.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SellerDao  sellerDao =  DaoFactory.createSellerDao();
		
		System.out.println("=== teste 1: seller findById =======");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

		
		System.out.println("\n\n=== teste 2: seller findByDepatmentId ========");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n=== teste 3: seller findAll======");
	
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		/*
		System.out.println("\n\n=== teste 4: seller insert======");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido new id: " + newSeller.getId());
		
		
		*/
		
		System.out.println("\n\n=== teste 5: seller update ======");
		
		seller = sellerDao.findById(2); 
		seller.setName("Marth Weine");
		
		sellerDao.update(seller);
		System.out.println("Update com sucesso!!! ");
		
		
		System.out.println("\n\n=== teste 6: seller delette  ======");
		
		int n = 100;
		
		sellerDao.deleteById(n);
		System.out.println("Deletado !!!");
		
	
	}

}
