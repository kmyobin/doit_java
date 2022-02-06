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
	public boolean equals(Object obj) { // equals 재정의
		if(obj instanceof Student) {
			Student std=(Student)obj;
			// 재정의한 equals() 메서드는 학생의 학번이 같으면 true 반환
			if(this.studentId==std.studentId) {return true;}
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() { // 해시코드 값으로 학번을 반환하도록 메서드 재정의
		return studentId;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee=new Student(100,"이상원");
		Student studentLee2=studentLee; // 인스턴스 동일
		Student studentSang=new Student(100,"이상원"); 
		
		// 동일한 주소의 두 인스턴스 비교
		if(studentLee==studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}
		else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentLee2)) { // Student에서 재정의한 equals
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		}
		else {
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		}
		
		// 동일인이지만 인스턴스의 주소가 다른 경우
		if(studentLee==studentSang) { // 두 인스턴스의 주소가 다름
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		}
		else {
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentSang)) { // Student에서 재정의한 equals
			System.out.println("studentLee와 studentSang은 동일합니다.");
		}
		else {
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
		}
		
		// 학번을 반환하도록 재정의한 hashCode
		System.out.println("studentLee의 hashCode : "+studentLee.hashCode());
		System.out.println("studentSang의 hashCode : "+studentSang.hashCode());
		
		// 실제 메모리 주소 값
		System.out.println("studentLee의 실제 주소 값 : "+System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소 값 : "+System.identityHashCode(studentSang));
	}



	
}
