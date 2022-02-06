package object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	
	@Override
	public String toString() { // Book Ŭ�������� toString() �޼��� ���� ������
		return bookTitle+","+bookNumber;
	}
}


public class ToStringEx{
	public static void main(String[] args) {
		Book book1=new Book(200,"����");
		
		System.out.println(book1); // �ν��Ͻ� ����(�ڵ����� Object Ŭ������ toString() �޼��尡 ȣ���)
		System.out.println(book1.toString()); // toString() �޼���� �ν��Ͻ� ����(Ŭ�����̸�.�ּ� ��)�� ������
		// getClass().getName()+'@'+Integer.toHexString(hashCode()) 16������
		
		/*String str=new String("test");
		System.out.println(str); // ���⼭�� hashcode�� ������ ����. String class���� toString() �޼��带 �̸� �������߱� ����
		Integer i1=new Integer(100);
		System.out.println(i1);*/
	}
}