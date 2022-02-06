package array;

public class StudentArray {

	public static void main(String[] args) {
		Student[] data=new Student[3];
		
		data[0]=new Student(1001, "James");
		data[1]=new Student(1002, "Tomas");
		data[2]=new Student(1003, "Edward");
		
		for(int i=0; i<data.length; i++) {
			data[i].showStudentInfo();
		}
	}

}
