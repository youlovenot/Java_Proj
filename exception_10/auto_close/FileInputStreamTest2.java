package exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {		//AutoClose를 사용해서 객체 해제(삭제)

	public static void main(String[] args) {
		
		//FileInputStream은 Closeable 인터페이스를 구현 하고있다.
		
		try (FileInputStream fis = new FileInputStream ("C:\\test\\input01.txt") ){
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		} catch (IOException e1) {
			System.out.println(e1);
		}
		System.out.println("프로그램 종료");
	}

}
