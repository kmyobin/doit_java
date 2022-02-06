package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("output2.txt", true); // append
		
		try(fos){
			byte[] bs=new byte[26];
			byte data=65;
			for(int i=0; i<bs.length; i++) { // A부터 Z까지 배열에 넣기
				bs[i]=data;
				data++;
			}
			fos.write(bs); // 배열을 한꺼번에 출력
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
