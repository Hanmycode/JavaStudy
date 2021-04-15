package SubjectEnrolmentSystem;

import java.util.Arrays;

public class Enrolment {
	private Subject sub;
	private Student stuList[];
//	private String year;
//	private String semester;

	public Enrolment(Subject sub, int maxSize) {
		this.sub = sub;
		stuList= new Student[maxSize];
	}
	
	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public Student[] getStuList() {
		return stuList;
	}

	public void setStuList(Student[] stuList) {
		this.stuList = stuList;
	}

	public String toString() {
		String info;
		info  = "======================================\n";
//		info += "\t" + this.year + "ѧ��"  + this.semester + "ѧ��\n";
		info += this.sub.toString() + "\n";
		info += "======================================\n";
		info += "ѧ��\t����\n";
		for(int i=0;i<stuList.length&&stuList[i]!=null;i++) {
			info += stuList[i].toString(); 
		}
		info += "======================================";
		return info;
		
	}
	
	
}
