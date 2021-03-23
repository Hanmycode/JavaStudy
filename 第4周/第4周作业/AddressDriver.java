package week4;

public class AddressDriver {
	public static void main(String[] args) {
		Address a1 = new Address("中国", "湖北省", "武汉市", "庙山街道", "430212");
		Address a2 = new Address("中国", "山东省", "泰安市", "岱庙街道", "271000");

		System.out.println("地址1为:" + a1.detail());
		System.out.println("地址2为:" + a2.detail());

	}
}
