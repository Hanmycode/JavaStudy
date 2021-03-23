package week4;

public class Address {
	// instance variable
	private String nation;
	private String province;
	private String city;
	private String street;
	private String postcode;

	// constructor
	public Address(String nation, String province, String city, String street, String postcode) {
		super();
		this.nation = nation;
		this.province = province;
		this.city = city;
		this.street = street;
		this.postcode = postcode;
	}

	// instance method
	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String detail() {
		return (nation + province + city + street + postcode);
	}

}
