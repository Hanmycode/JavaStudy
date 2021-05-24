package StudentScore.vo;

public class Course {
	private String id;
	private String course;
	private float grade;
	public Course() {
		super();
	}
	public Course(String id, String course, float grade) {
		super();
		this.id = id;
		this.course = course;
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
		return id + "\t" + course + "\t" + grade;
	}

	
	
	
}
