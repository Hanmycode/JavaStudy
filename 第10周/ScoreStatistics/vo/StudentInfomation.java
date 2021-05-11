package ScoreStatistics.vo;

public class StudentInfomation {
	private String id;
	private String name;
	private String gender;

	public StudentInfomation() {
		super();
	}

	public StudentInfomation(String i, String na, String gen) {
		super();
		id = i;
		name = na;
		gender = gen;
	}

	public String getId() {
		return id;
	}

	public void setId(String i) {
		id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String na) {
		name = na;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gen) {
		gender = gen;
	}

	@Override
	public String toString() {
		return "StudentInfomation [Id=" + id + ", Name=" + name + ", Gender=" + gender + "]";
	}
}
