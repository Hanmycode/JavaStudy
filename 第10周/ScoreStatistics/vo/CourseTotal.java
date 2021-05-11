package ScoreStatistics.vo;

public class CourseTotal {
	private String course;
	private double total;
	private int num;

	public CourseTotal() {
		super();
	}

	public CourseTotal(String cou, double tot, int n) {
		super();
		course = cou;
		total = tot;
		num = n;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String cou) {
		course = cou;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double tot) {
		total = tot;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int n) {
		num = n;
	}

}
