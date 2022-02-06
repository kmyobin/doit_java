package array;

public class Student {
	int studentID;
	String name;
	
	public Student(int id, String n) {
		studentID=id;
		name=n;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID+", "+name);
	}
}
