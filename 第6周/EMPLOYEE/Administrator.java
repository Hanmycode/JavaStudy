package EMPLOYEE;

public class Administrator extends Employee{
	private double bonus;
	
	public Administrator() {
		super();
	}
	
	

	public Administrator(String id, String name, String department, double basesalary, double bonus) {
		super(id, name, department, basesalary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//方法的重写(overwrite)
	public void updateSalary() {
		super.setBasesalary(super.getBasesalary()+this.bonus);
	}
	
	public String toString() {
		String msg = super.toString();
		msg += ", bonus=" + this.bonus;
		return msg;
	}
	
}
