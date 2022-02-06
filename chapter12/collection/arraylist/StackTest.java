package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data); // ������ �� �ڿ� ��� �߰�
	}
	
	public String pop() {
		int len=arrayStack.size(); // ArrayList�� ����� ��ȿ�� �ڷ��� ����
		if(len==0) { // ���̰� 0�̸� ������ �ƹ� �͵� ���ٴ� ��
			System.out.println("������ ������ϴ�.");
			return null;
		}
		
		return(arrayStack.remove(len-1)); // �� �ڿ� �ִ� �ڷ� ��ȯ�ϰ� �迭���� ����
	}
}

public class StackTest {

	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		/* 
		 * | |  | |  |C| 
		 * | |  |B|  |B|
		 * |A|  |A|  |A|
		 */
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		/*
		 *  | | | | | |
		 *  |B| | | | |
		 *  |A| |A| | |
		 */
	}

}
