package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try { // 예외 구문
			fis=new FileInputStream("a.txt");
		} 
		catch(FileNotFoundException e) { // 예외 처리
			System.out.println(e);
			return;
		}
		finally { // 항상 수행되는 부분
			if(fis!=null) {
				try {
					fis.close(); // 파일 입력 스트림 닫기
				} 
				catch(IOException e) {
					e.printStackTrace(); // 파일이 없으면 예외 처리
				}
			}
			System.out.println("항상 수행됩니다."); // 항상 수행되는 finally문의 특징
		}
		System.out.println("여기도 수행됩니다."); // return 때문에 안됨
	}
}
