package string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1=new String("abc"); // new : ���ο� �޸𸮰� �Ҵ�ǰ� ���ο� ��ü�� ������
		String str2=new String("abc");
		
		System.out.println(str1==str2); // ���� ���� �ּ�����?
		System.out.println(str1.equals(str2)); // ���� ���� ���ڿ�����? (������)
		
		String str3="abc"; // ��� Ǯ. ���ڿ� ����� �޸� �ּҸ� ����Ű�� ��
		String str4="abc";
		
		System.out.println(str3==str4); // �ּҰ� ������?(true)
		System.out.println(str3.equals(str4)); // ���� ���� ���ڿ�����? (������)
	}

}
