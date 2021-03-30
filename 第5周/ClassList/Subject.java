package ClassList;

public class Subject {
	private String subjectID;
	private String subjectName;
	
	public Subject(String subjectID, String subjectName) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String toString() {
		String info;
		info = "课程代码:" + this.subjectID + "\t" + "课程名称:" + this.subjectName;
		return info;
	}
	
}
