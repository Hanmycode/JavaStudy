package StringSplit;

public class Student {
	private String id;
	private String name;
	private String sex;
	private String birth;
	
	public Student() {
		super();
	}
	
	public Student(String id, String name, String sex, String birth) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", birth=" + birth + "]";
	}
	
	
	
}
