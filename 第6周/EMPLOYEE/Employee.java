package EMPLOYEE;

public class Employee {
	private String id;
	private String name;
	private String department;
	private double basesalary;

	public Employee() {
		super();
	}

	public Employee(String id, String name, String department, double basesalary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.basesalary = basesalary;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	public double getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(double basesalary) {
		this.basesalary = basesalary;
	}

	public void updateSalary() {
		this.basesalary = this.basesalary * 1.0725;
	}

	public String toString() {
		return "id="+this.id+ ", name=" + this.name 
				+ ", department=" + this.department 
				+ ", basesalary=" + this.basesalary;
	}

}
