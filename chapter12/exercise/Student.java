package exercise;

public class Student implements Comparable<Student>{
	private int studentId;
	private String studentName;
	
	public Student(String memberId, String memberName) {
		this.studentId=Integer.parseInt(memberId);
		this.studentName=memberName;
	}
	
	public int getStudentId() {return studentId;}
	
	public void setStudentId(int memberId) {this.studentId=memberId;}
	
	public String getStudentName() {return studentName;}
	
	public void setStudentNAme(String memberName) {this.studentName=memberName;}
	
	@Override
	public String toString() {
		return studentId+":"+studentName; // toString() 메서드 재정의
	}

	@Override
	public int hashCode() {
		return studentId; // 회원 아이디를 반환하도록 재정의
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student=(Student)obj;
			if(this.studentId==student.studentId) {return true;} 
			else {return false;}
		}
		return false;
	}

	@Override
	public int compareTo(Student member) { // this 값 크면 오름차순 정렬. this 값 작으면 내림차순 정렬
		// 객체가 TreeSet에 요소를 추가할 때 호출되는 메서드
		return (this.studentId-member.studentId); // 새 아이디 - 기존 아이디 
		// 새 아이디가 더 크면 양수.(오른쪽)
		// 새 아이디가 더 작으면 음수.(왼쪽)
		
		/*
		 * 내림차순 정렬하려면
		 * return (this.memberId-member.memberId)*(-1)); // 내림차순으로 정렬하기 위해 반환 값을 음수로 만듦
		 */
	}
}
