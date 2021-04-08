package EMPLOYEE;

public class Employee_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrator admin = new Administrator("01", "张三", "guanli", 10000, 2000);
		admin.updateSalary();
		System.out.println(admin.toString());
		
		SalePerson sale = new SalePerson("02", "李四", "xiaoshou", 6000, 50000);
		sale.updateSalary();
		System.out.println(sale.toString());
		
	}

}
