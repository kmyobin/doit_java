package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.Externalizable;

class Dog implements Externalizable {
	String name;
	
	public Dog() {}
	
	//Externalizable 인터페이스의 메서드 구현
	@Override
	public void writeExternal(ObjectOutput out) throws IOException{
		out.writeUTF(name);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		name=in.readUTF();
	}
	
	public String toString() {
		return name;
	}
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Dog myDog=new Dog();
		myDog.name="멍멍이";
		
		FileOutputStream fos=new FileOutputStream("external.out"); // external.out 쓸거임
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		try(fos; oos){
			oos.writeObject(myDog); // 멍멍이 external.out에 넣기
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis=new FileInputStream("external.out"); // external 읽어들이기
		ObjectInputStream ois=new ObjectInputStream(fis); // Object 읽기
		
		Dog dog=(Dog)ois.readObject(); // dog에 Object 읽어 들이기(멍멍이)
		System.out.println(dog); // toString()
	}

}
