package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf=new RandomAccessFile("random.txt", "rw"); // 읽고 쓰기 모두 가능
		
		rf.writeInt(100); // int는 4byte이므로 파일 포인터 위치 4로 바뀜
		System.out.println("파일 포인터 위치 : "+rf.getFilePointer()); // 파일 포인터 위치를 반환하는 메서드
		
		rf.writeDouble(3.14); // 4 + 8 = 12
		System.out.println("파일 포인터 위치 : "+rf.getFilePointer());
		
		rf.writeUTF("안녕하세요"); // 12 + 한글(3byte)*5 + null문자(2byte) = 17
		System.out.println("파일 포인터 위치 : "+rf.getFilePointer());
		
		rf.seek(0); // 파일 포인터 위치를 0으로 옮김
		System.out.println("파일 포인터 위치 : "+rf.getFilePointer());
		
		int i=rf.readInt();
		double d=rf.readDouble();
		String str=rf.readUTF();
		
		System.out.println("파일 포인터 위치 : "+rf.getFilePointer()); // 다 읽고 나면 맨 마지막
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	
	}

}
