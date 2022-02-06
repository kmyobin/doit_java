package school;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName; 
	private Subject majorSubject; // 필수 과목
	
	private ArrayList<Score> scoreList=new ArrayList<Score>(); // 학생이 수강한 과목의 점수 리스트
	
	public Student(int studentID, String studentName, Subject majorSubject) {
		this.studentID=studentID;
		this.studentName=studentName;
		this.majorSubject=majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	public int getStudentID() {return studentID;}
	
	public void setStudentID(int studentID) {
		this.studentID=studentID;
	}
	
	public String getStudentName() {return studentName;}
	
	public Subject getMajorSubject() {return majorSubject;}
	
	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject=majorSubject;
	}
	
	public ArrayList<Score> getScoreList(){
		return scoreList;
	}
	
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList=scoreList;
	}
}
