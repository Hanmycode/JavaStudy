package week4;

public class RectangleDriver {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.display();
		System.out.println("矩形r1面积=" + r1.area());
		System.out.println("矩形r1周长=" + r1.perimeter());
		System.out.println();

		Rectangle r2 = new Rectangle(5.0f, 6.0f);
		r2.display();
		System.out.println("矩形r2面积=" + r2.area());
		System.out.println("矩形r2周长=" + r2.perimeter());
		System.out.println();

		r2.setLength(10.0f);
		r2.setWidth(20.0f);
		r2.display();
		System.out.println("更改后的矩形r2面积=" + r2.area());
		System.out.println("更改后的矩形r2周长=" + r2.perimeter());

	}
}
