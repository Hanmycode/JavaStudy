package week4;

public class Dog {
	// instance variable
	private String name;
	private String color;
	private int age;

	// constructor
	public Dog() {

	}

	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	// instance method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor(String color) {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge(int age) {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String info() {
		String info = "Ãû×Ö:" + this.name + "  ÑÕÉ«:" + this.color + "  ÄêÁä:" + this.age;
		return info;
	}

}
