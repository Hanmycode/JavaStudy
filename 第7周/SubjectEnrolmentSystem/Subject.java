package SubjectEnrolmentSystem;

public class Subject {
	private String subjectID;
	private String subjectName;
	private int maxNumber;
	
	public Subject(String subjectID, String subjectName, int maxNumber) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.maxNumber = maxNumber;
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
	
	public int getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	public String toString() {
		String info;
		info = "�γ̴���:" + this.subjectID + "  �γ�����:" 
		+ this.subjectName + "  �������:" + this.maxNumber;
		return info;
	}
	
}
