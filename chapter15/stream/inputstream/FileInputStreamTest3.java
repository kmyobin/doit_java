package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("input2.txt")){
			byte[] bs=new byte[10];
			int i;
			while((i=fis.read(bs))!=-1) { // i=읽어 들인 자료의 바이트 수
				for(byte b: bs) {
					System.out.print((char)b);
				}
				/*
				 * for(int k=0; k<i; k++){ // 기존 자료 없이 출력
				 * 	System.out.print((char)bs[k]);
				 * }
				 */
				System.out.println(": "+i+" byte 읽음");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
