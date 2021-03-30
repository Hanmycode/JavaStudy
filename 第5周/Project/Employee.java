package week5;

public class Employee {
	private String department;
	private String name;
	private double basesalary;

	public Employee() {
		super();
	}

	public Employee(String department, String name, double basesalary) {
		super();
		this.department = department;
		this.name = name;
		this.basesalary = basesalary;
	}



	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(double basesalary) {
		this.basesalary = basesalary;
	}

	public void updateSalary() {
		this.basesalary = this.basesalary * (1 + 0.035);
	}

	public String toString() {
		return "name=" + this.name 
				+ ", department=" + this.department 
				+ ", basesalary=" + this.basesalary;

	}

}
