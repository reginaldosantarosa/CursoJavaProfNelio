package model.dal;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj) ;
	
	void update(Seller obj);
	
	void deleteById(Integer id);
	
	//busca por um d os vendedores
	Seller findById(Integer id);
	
	//busca por id os vendedores
	List<Seller> findAll();
	
	//busca por departamento
	List<Seller> findByDepartment(Department department);
	
}
