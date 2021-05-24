package StudentScore;

import java.util.ArrayList;

import StudentScore.dao.Dao;
import StudentScore.vo.Course;
import StudentScore.vo.Result;
import StudentScore.vo.Student;



public class Driver {
	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList = Dao.importStudentFromTxt();     
		ArrayList<Course> couList = new ArrayList<Course>();
		couList = Dao.importCourseFromExcel();		
		
		ArrayList<Student> list3 = new ArrayList<Student>();
		list3 = Dao.processByStudent(stuList,couList);
		ArrayList<Result> list4 = new ArrayList<Result>();
		list4 = Dao.processByCourse(couList);
		
		Dao.printAll(list3,list4);
		Dao.writeTxt(list3,list4);
	}
	
	
	
	
}
