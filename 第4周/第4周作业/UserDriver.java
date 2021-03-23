package week4;

public class UserDriver {

	public static void main(String[] args) {
		User u1 = new User("张三");
		User u2 = new User("李四", "lisi444");
		User u3 = new User("王五", "wangwu555");

		u1.setPassword("zhangsan333");

		System.out.println(u1.info());
		System.out.println(u2.info());
		System.out.println(u3.info());
		System.out.println("用户个数:" + User.userNum());

	}

}
