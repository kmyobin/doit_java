package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue=new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data); // 큐의 맨 뒤에 추가
	}
	
	public String deQueue() {
		int len=arrayQueue.size();
		if(len==0) { // size가 0이면
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return (arrayQueue.remove(0)); // 맨 앞의 자료 반환 후 배열에서 제거
	}
}

public class QueueTest {
	public static void main(String[] args) {
		MyQueue queue=new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
