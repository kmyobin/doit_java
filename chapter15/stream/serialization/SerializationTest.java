package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable { // 직렬화를 하겠다는 의지
	private static final long serialVerisionUID=-150325402544036183L;// 버전 관리를 위한 정보
	String name;
	transient String job; // 저장되지 않음
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name=name;
		this.job=job;
	}
	
	public String toString() {
		return name+", "+job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person personAhn=new Person("안재용", "대표이사");
		Person personKim=new Person("김철수", "상무이사");
		
		try(FileOutputStream fos=new FileOutputStream("serial.out"); // 쓸거야
				ObjectOutputStream oos=new ObjectOutputStream(fos)){ // 인스턴스를 저장하거나 전송할 때 필요한 ObjectStream
			oos.writeObject(personAhn); // person의 정보(인스턴스)를 파일에 쓴다(직렬화)
			oos.writeObject(personKim);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream("serial.out");
				ObjectInputStream ois=new ObjectInputStream(fis)){
			Person p1=(Person)ois.readObject(); // person의 값을 파일에서 읽어 들임(역직렬화)
			Person p2=(Person)ois.readObject();
			
			System.out.println(p1); // toString() 오버라이딩한거 출력됨
			System.out.println(p2);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
