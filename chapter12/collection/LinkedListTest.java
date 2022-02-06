package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList=new LinkedList<String>();
		
		myList.add("A"); // 링크드 리스트에 요소 추가
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList); // A B C
		
		myList.add(1, "D"); // 첫번째 위치에 D 추가
		System.out.println(myList); // A D B C
		
		myList.addFirst("0"); // 연결 리스트의 맨 앞에 0 추가
		System.out.println(myList); // 0 A D B C
		
		System.out.println(myList.removeLast()); // 맨뒤 요소 삭제 후 해당 요소 출력
		System.out.println(myList); // 0 A D B
	}

}
