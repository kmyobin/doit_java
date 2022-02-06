package stream.others;


import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args)throws IOException {
		File file=new File("C:\\Users\\sowha\\eclipse-workspace\\DoIt_JAVA\\chapter15\\stream\\newFile.txt"); // 아직 파일이 생성된 건 아님
		file.createNewFile(); // 실제 파일 생성
		
		// 파일의 속성을 살펴보는 메서드 호출
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete(); // 파일 삭제돼서 안보임
	}

}
