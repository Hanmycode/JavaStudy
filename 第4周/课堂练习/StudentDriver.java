package week4;

public class StudentDriver {
	public static void main(String arg[]) {
		Student stu1 = new Student("����", "666666", "201901");
		Student stu2 = new Student("����", "555555", "201902");
		// ��ʾ������Ϣ
		stu1.displayStudent();
		stu2.displayStudent();
		System.out.println();
		// �����޸���������
		stu1.setName("����");
		String newName = stu1.getName();
		// �����޸ĵ绰����
		stu2.setPhoneNum("777777");
		String newPhone = stu2.getPhoneNum();
		// ��ʾ������Ϣ
		System.out.println("�޸ĺ��:");
		stu1.displayStudent();
		stu2.displayStudent();

	}
}
