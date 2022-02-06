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
		return studentId+":"+studentName; // toString() �޼��� ������
	}

	@Override
	public int hashCode() {
		return studentId; // ȸ�� ���̵� ��ȯ�ϵ��� ������
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
	public int compareTo(Student member) { // this �� ũ�� �������� ����. this �� ������ �������� ����
		// ��ü�� TreeSet�� ��Ҹ� �߰��� �� ȣ��Ǵ� �޼���
		return (this.studentId-member.studentId); // �� ���̵� - ���� ���̵� 
		// �� ���̵� �� ũ�� ���.(������)
		// �� ���̵� �� ������ ����.(����)
		
		/*
		 * �������� �����Ϸ���
		 * return (this.memberId-member.memberId)*(-1)); // ������������ �����ϱ� ���� ��ȯ ���� ������ ����
		 */
	}
}
