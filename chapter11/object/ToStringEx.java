package object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	
	@Override
	public String toString() { // Book 클래스에서 toString() 메서드 직접 재정의
		return bookTitle+","+bookNumber;
	}
}


public class ToStringEx{
	public static void main(String[] args) {
		Book book1=new Book(200,"개미");
		
		System.out.println(book1); // 인스턴스 정보(자동으로 Object 클래스의 toString() 메서드가 호출됨)
		System.out.println(book1.toString()); // toString() 메서드로 인스턴스 정보(클래스이름.주소 값)를 보여줌
		// getClass().getName()+'@'+Integer.toHexString(hashCode()) 16진수값
		
		/*String str=new String("test");
		System.out.println(str); // 여기서는 hashcode가 나오지 않음. String class에서 toString() 메서드를 미리 재정의했기 때문
		Integer i1=new Integer(100);
		System.out.println(i1);*/
	}
}