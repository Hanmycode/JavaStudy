package Driver;

import java.util.ArrayList;
import java.util.Scanner;

import ScoreStatistics.dao.Statistics_dao;
import ScoreStatistics.vo.CourseResult;
import ScoreStatistics.vo.ScoreInfomation;
import ScoreStatistics.vo.StudentInfomation;
import ScoreStatistics.vo.StudentResult;


public class driver {
	public static void main(String[] args) {

		Statistics_dao a = new Statistics_dao();
		ArrayList<StudentInfomation> StuInfo = a.inputStuInfo();
		ArrayList<ScoreInfomation> ScoInfo = a.inputScore();

		ArrayList<StudentResult> StuRes = a.getStuResult(StuInfo, ScoInfo);
		ArrayList<CourseResult> CouRes = a.disposeCla(ScoInfo);

		StringBuffer result = a.output(StuRes, CouRes);
		System.out.println(result);
	}
}
