package exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {		//AutoClose없이 객체 해제(삭제)

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c:\\test\\c.txt");	//FileNotFoundException
			
			System.out.println((char)fis.read());	//IOException
			System.out.println((char)fis.read());	//한글자를 읽어서 문자로 출력(영문)
			System.out.println((char)fis.read());
			
			
			//IOException 하위에 FileNotFoundException이 존재한다.
			//catch 블락에 하위 Exception을 먼저 처리하고, 상위 Exception을 처리
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
			//e.printStackTrace();
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
				//e.printStackTrace();
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
			
	}

}
