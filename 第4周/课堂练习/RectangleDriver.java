package week4;

public class RectangleDriver {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.display();
		System.out.println("����r1���=" + r1.area());
		System.out.println("����r1�ܳ�=" + r1.perimeter());
		System.out.println();

		Rectangle r2 = new Rectangle(5.0f, 6.0f);
		r2.display();
		System.out.println("����r2���=" + r2.area());
		System.out.println("����r2�ܳ�=" + r2.perimeter());
		System.out.println();

		r2.setLength(10.0f);
		r2.setWidth(20.0f);
		r2.display();
		System.out.println("���ĺ�ľ���r2���=" + r2.area());
		System.out.println("���ĺ�ľ���r2�ܳ�=" + r2.perimeter());

	}
}
