package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("input.txt"); // input.txt 파일 입력 스트림 생성
			System.out.println(fis.read()); // A 읽기
			System.out.println(fis.read()); // B 읽기
			System.out.println(fis.read()); // C 읽기
		}
		catch(IOException e) { // 오류 발생(input.txt가 존재하지 않으므로)
			System.out.println(e);
		}
		finally {
			try {
				fis.close(); // 열린 스트림은 finally 블록에서 닫기
			}
			catch(IOException e) {
				System.out.println(e);
			}
			catch(NullPointerException e) { // stream이 null인 경우(stream이 생성되지 않았으므로 오류 발생)
				System.out.println(e);
			}
		}
		System.out.println("end"); // 출력됨(프로그램이 중단되지 않았다는 뜻)
	}

}
