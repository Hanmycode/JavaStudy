package week4;

public class StudentDriver {
	public static void main(String arg[]) {
		Student stu1 = new Student("张三", "666666", "201901");
		Student stu2 = new Student("李四", "555555", "201902");
		// 显示所有信息
		stu1.displayStudent();
		stu2.displayStudent();
		System.out.println();
		// 调用修改姓名方法
		stu1.setName("王五");
		String newName = stu1.getName();
		// 调用修改电话方法
		stu2.setPhoneNum("777777");
		String newPhone = stu2.getPhoneNum();
		// 显示所有信息
		System.out.println("修改后的:");
		stu1.displayStudent();
		stu2.displayStudent();

	}
}
