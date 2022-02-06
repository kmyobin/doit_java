package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className)  // FileInputStream을 열고 Class를 동적으로 로딩하여 반환
			throws FileNotFoundException, ClassNotFoundException { // 두 예외를 메서드가 호출될 때 처리하도록 미룸
		FileInputStream fis=new FileInputStream(fileName); // FileNotFoundException 발생 가능
		Class c=Class.forName(className); // ClassNotFoundException 발생 가능
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test=new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		}
		catch(FileNotFoundException e) { // 파일을 찾을 수 없거나
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) { // 클래스를 찾을 수 없을 때
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace(); // Exception 클래스(모든 예외 클래스의 최상위)로 그 외 예외 상황 처리
		}
		
		/*ThrowsException test=new ThrowsException();
		test.loadClass("a.txt", "java.lang.String"); // 메서드를 호출할 때 예외를 처리함*/
	}

}
