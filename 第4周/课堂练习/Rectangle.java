package week4;

public class Rectangle {
	// instance variable
	private float length;
	private float width;

	// constructor
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	// instance method
	public float getLength() {
		return this.length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return this.width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public void display() {
		System.out.println("³¤Îª:" + this.length + "  ¿íÎª:" + this.width);
	}

	public float area() {
		return (length * width);
	}

	public float perimeter() {
		return (length + width) * 2;
	}

	
	
}
