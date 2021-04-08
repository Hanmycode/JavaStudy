package EMPLOYEE;

public class SalePerson extends Employee{
	private double yearlySales;

	public SalePerson() {
		super();
	}
	
	public SalePerson(String id, String name, String department, double basesalary, double yearlySales) {
		super(id, name, department, basesalary);
		this.yearlySales = yearlySales;
	}

	public double getYearlySales() {
		return yearlySales;
	}

	public void setYearlySales(double yearlySales) {
		this.yearlySales = yearlySales;
	}
	
	//方法的重写(overwrite)
	public String toString() {
		String msg = super.toString();
		msg += ", yearlySales=" + this.yearlySales;
		return msg;
	}
	
	public void updateSalary() {
		super.setBasesalary(super.getBasesalary()+this.yearlySales*0.1);
	}
	
}
