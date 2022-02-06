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
	
	//Externalizable �������̽��� �޼��� ����
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
		myDog.name="�۸���";
		
		FileOutputStream fos=new FileOutputStream("external.out"); // external.out ������
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		try(fos; oos){
			oos.writeObject(myDog); // �۸��� external.out�� �ֱ�
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis=new FileInputStream("external.out"); // external �о���̱�
		ObjectInputStream ois=new ObjectInputStream(fis); // Object �б�
		
		Dog dog=(Dog)ois.readObject(); // dog�� Object �о� ���̱�(�۸���)
		System.out.println(dog); // toString()
	}

}
