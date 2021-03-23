package week4;

public class Student {

	// instance variable
	private String name;
	private String phoneNum;
	private String studentNum;

	// constructor
	public Student(String name, String phoneNum, String studentNum) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.studentNum = studentNum;

	}

	// instance method
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getStudentNum() {
		return this.studentNum;
	}

	public void setStudentNum(String name) {
		this.studentNum = studentNum;
	}

	public void displayStudent() {
		String info = "姓名:" + this.name + "  电话:" + this.phoneNum + " 学号:" + this.studentNum;
		System.out.println(info);
	}

}
