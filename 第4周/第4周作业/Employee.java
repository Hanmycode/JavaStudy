package week4;

public class Employee {
	// instance variable
	private String id;
	private String name;
	private float baseSalary;
	private float newSalary;

	// constructor
	public Employee() {

	}

	public Employee(String id, String name, float baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	// instance method

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

	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void updateSalary() {
		this.newSalary = this.baseSalary * 1.15f;
	}

	public String detail() {
		String info = "姓名:" + this.name + "  工号:" + this.id + "  基本工资:" + this.baseSalary + "  工资增长额:"
				+ String.format("%.2f", (this.baseSalary * 0.15f)) + "  增长后工资:" + this.newSalary;
		return info;
	}

}
