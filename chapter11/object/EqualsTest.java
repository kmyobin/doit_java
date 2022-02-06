package object;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	public String toString() {
		return studentId+","+studentName;
	}
	
	@Override
	public boolean equals(Object obj) { // equals ������
		if(obj instanceof Student) {
			Student std=(Student)obj;
			// �������� equals() �޼���� �л��� �й��� ������ true ��ȯ
			if(this.studentId==std.studentId) {return true;}
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() { // �ؽ��ڵ� ������ �й��� ��ȯ�ϵ��� �޼��� ������
		return studentId;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee=new Student(100,"�̻��");
		Student studentLee2=studentLee; // �ν��Ͻ� ����
		Student studentSang=new Student(100,"�̻��"); 
		
		// ������ �ּ��� �� �ν��Ͻ� ��
		if(studentLee==studentLee2) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		}
		else {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		}
		
		if(studentLee.equals(studentLee2)) { // Student���� �������� equals
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		}
		else {
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		}
		
		// ������������ �ν��Ͻ��� �ּҰ� �ٸ� ���
		if(studentLee==studentSang) { // �� �ν��Ͻ��� �ּҰ� �ٸ�
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		}
		else {
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
		}
		
		if(studentLee.equals(studentSang)) { // Student���� �������� equals
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
		}
		else {
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
		}
		
		// �й��� ��ȯ�ϵ��� �������� hashCode
		System.out.println("studentLee�� hashCode : "+studentLee.hashCode());
		System.out.println("studentSang�� hashCode : "+studentSang.hashCode());
		
		// ���� �޸� �ּ� ��
		System.out.println("studentLee�� ���� �ּ� �� : "+System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּ� �� : "+System.identityHashCode(studentSang));
	}



	
}