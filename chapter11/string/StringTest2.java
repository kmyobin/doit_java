package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr=new String("java"); // new�� �Ҵ�� �� ������ �Ұ���
		String androidStr=new String("android"); 
		System.out.println(javaStr); 
		System.out.println("ó�� ���ڿ� �ּ� ��: "+System.identityHashCode(javaStr));
		
		javaStr=javaStr.concat(androidStr); // ���ڿ� javaStr+androidStr�� ����
		// ���� ������ ���ڿ� ����Ŵ
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּ� ��: "+System.identityHashCode(javaStr));
	}
	
	
	/*
	 javaStr -x-> "java"             androidStr --> "android"
	         ---> "javaandroid" ���� ������ ���ڿ� ����Ŵ
	 */

}
