package BANK;

public class Customer {
	private String ssn;
	private String name;
	private CheckingAccount ca;
	private SavingAccount sa;

	public Customer() {
		super();
	}

	public Customer(String ssn, String name, CheckingAccount ca, SavingAccount sa) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.ca = ca;
		this.sa = sa;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CheckingAccount getCa() {
		return ca;
	}

	public void setCa(CheckingAccount ca) {
		this.ca = ca;
	}

	public SavingAccount getSa() {
		return sa;
	}

	public void setSa(SavingAccount sa) {
		this.sa = sa;
	}

	public String toString() {
		String info = "";
		info = "身份证号码:" + this.ssn + ", 姓名:" + this.name;
		return info;
	}

}
