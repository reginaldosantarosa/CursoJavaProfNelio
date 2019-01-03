
public class Funcionario implements Comparable<Funcionario> {
	
	private String name;
	private Double salary;

	public Funcionario(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Funcionario other) {
		return name.compareTo(other.getName());
		//return  - salary.compareTo(other.getSalary());
	}
}