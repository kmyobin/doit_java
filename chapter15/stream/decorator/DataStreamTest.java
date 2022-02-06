package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("data.txt"); // data.txt라는 txt를 만듦
				DataOutputStream dos=new DataOutputStream(fos)){ // 메모리에 저장된 상태 그대로 쓴다
			dos.writeByte(100); // 각 자료형에 맞게 씀
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("test");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis=new FileInputStream("data.txt");
				DataInputStream dis=new DataInputStream(fis)){
			System.out.println(dis.readByte()); // 자료형에 맞게 자료를 읽어 출력함. 파일에 쓴 순서대로 읽어야됨
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
