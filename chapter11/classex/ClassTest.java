package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException { // forName() 메서드에서 발생하는 예외 처리. 이름과 일치하는 클래스가 없는 경우 예외 발생
		Person person=new Person();
		Class pClass1=person.getClass(); // 이 경우 미리 인스턴스를 생성해놓아야함
		System.out.println(pClass1.getName());
		
		Class pClass2=Person.class; // 직접 class 파일 대입하기
		System.out.println(pClass2.getName());
		
		Class pClass3=Class.forName("classex.Person");
		System.out.println(pClass3.getName());
	}

}
