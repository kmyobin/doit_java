package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {
	private String subjectName;
	private int subjectID;
	private int gradeType;
	
	private ArrayList<Student> studentList=new ArrayList<Student> ();
	
	public Subject(String subjectName, int subjectID) {
		this.subjectID=subjectID;
		this.subjectName=subjectName;
		this.gradeType=Define.AB_TYPE; // 학점 평가 정책은 기본으로 A, B 방식을 사용함
	}
	
	public String getSubjectName() {return subjectName;}
	
	public void setSubjectName(String subjectName) {
		this.subjectName=subjectName;
	}
	
	public int getSubjectID() {return subjectID;}
	
	public void setSubjectID(int subjectID) {
		this.subjectID=subjectID;
	}
	
	public ArrayList<Student> getStudentList(){return studentList;}
	
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList=studentList;
	}
	
	public int getGradeType() {return gradeType;}
	
	public void setGradeType(int gradeType) {
		this.gradeType=gradeType;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
}
