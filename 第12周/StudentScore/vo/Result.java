package StudentScore.vo;

public class Result {
	private String course;
	private float grade;
	public Result() {
		super();
	}
	public Result(String course, float grade) {
		super();
		this.course = course;
		this.grade = grade;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		String result = String .format("%.2f",grade);
		return  course + "\t" + result;
	}
	

}
