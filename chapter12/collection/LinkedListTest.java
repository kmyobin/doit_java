package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList=new LinkedList<String>();
		
		myList.add("A"); // ��ũ�� ����Ʈ�� ��� �߰�
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList); // A B C
		
		myList.add(1, "D"); // ù��° ��ġ�� D �߰�
		System.out.println(myList); // A D B C
		
		myList.addFirst("0"); // ���� ����Ʈ�� �� �տ� 0 �߰�
		System.out.println(myList); // 0 A D B C
		
		System.out.println(myList.removeLast()); // �ǵ� ��� ���� �� �ش� ��� ���
		System.out.println(myList); // 0 A D B
	}

}
