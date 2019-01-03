package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;

	private Department department;
	
	private List<HourContract> contractes = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {

		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartament() {
		return department;
	}

	public void setDepartament(Department department) {
		this.department = department;
	}

	public List<HourContract> getContractes() {
		return contractes;
	}

	public void addContract(HourContract contract) {
		contractes.add(contract);

	}

	public void removeContract(HourContract contract) {
		contractes.remove(contract);

	}

	//quanto trabalhador ganhou por mes
	public double income(int year, int month) {
		double sum=baseSalary;
		Calendar cal=Calendar.getInstance();		
		for(HourContract c : contractes) {
			cal.setTime(c.getDate());
			int c_year=cal.get(Calendar.YEAR);			
			int c_month=cal.get(Calendar.MONTH)+1;
			
			if (c_year==year && c_month==month) {
				sum+=c.totalValue();
			}
		}
		
		return sum;
	}
}
