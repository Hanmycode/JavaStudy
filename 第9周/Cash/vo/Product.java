package Cash.vo;

public class Product {
	private String sno;
	private String name;
	private float price;
	private int count;
	private float totalPrice;
	
	public Product() {
		super();
	}

	public Product(String sno, String name, float price, int count, float totalPrice) {
		super();
		this.sno = sno;
		this.name = name;
		this.price = price;
		this.count = count;
		this.totalPrice = totalPrice;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return sno+"\t"+name+"\t"+count+"\t"+price+"\t"+totalPrice;
	}
	
	
}
