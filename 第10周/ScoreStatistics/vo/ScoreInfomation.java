package ScoreStatistics.vo;

public class ScoreInfomation {
	private String id;
	private String course;
	private double grade;

	public ScoreInfomation() {
		super();
	}

	public ScoreInfomation(String i, String cou, double gra) {
		super();
		id = i;
		course = cou;
		grade = gra;
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

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "ScoreInfomation [ID=" + id + ", Course=" + course + ", Grade=" + grade + "]";
	}
}
