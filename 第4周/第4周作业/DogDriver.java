package week4;

public class DogDriver {

	public static void main(String[] args) {

		Dog d1 = new Dog("小黑", "黑色", 2);
		Dog d2 = new Dog("大黄", "黄色", 3);

		System.out.println(d1.info());
		System.out.println(d2.info());

	}
}
