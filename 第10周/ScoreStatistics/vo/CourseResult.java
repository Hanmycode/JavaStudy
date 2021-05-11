package ScoreStatistics.vo;

public class CourseResult {
	private String Course;
	private double Avg;

	public CourseResult() {
		super();
	}

	public CourseResult(String course, double avg) {
		super();
		Course = course;
		Avg = avg;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public double getAvg() {
		return Avg;
	}

	public void setAvg(double avg) {
		Avg = avg;
	}

	@Override
	public String toString() {
		String msg = null;
		msg += this.Course + "\t" + this.Avg;
		return msg;
	}
}
