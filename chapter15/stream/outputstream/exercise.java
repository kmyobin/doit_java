package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class exercise {
	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("abc.txt");
				OutputStreamWriter osw=new OutputStreamWriter(fos)) {
			osw.write("���ݱ��� �ڹ� ���� ���� ����ְ� �߾��^^");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("�Ϸ�Ǿ����ϴ�.");
				
		
		try(FileInputStream fis=new FileInputStream("a.txt");
				InputStreamReader isr=new InputStreamReader(fis)){
			int i;
			while((i=isr.read())!=-1) {
				System.out.print((char)i); // �о����
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("�бⰡ �Ϸ�Ǿ����ϴ�.");
	}
}
