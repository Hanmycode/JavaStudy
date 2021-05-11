package ScoreStatistics.vo;

public class StudentResult {
	private String id;
	private String name;
	private String gender;
	private double avg;

	public StudentResult() {
		super();
	}

	public StudentResult(String id, String name, String gender, double avg) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.avg = avg;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		String msg = null;
		msg += this.id + "\t" + this.name + "\t" + this.gender + "\t" + this.avg;
		return msg;
	}
}
