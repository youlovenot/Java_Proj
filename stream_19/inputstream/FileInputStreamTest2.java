package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStreamTest2 {		//Finally 생략, Try with Resource

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){	//FileNotFoundException
				// try with resource, Finally에 close를 자동으로 처리
				// FileInputStream은 AutoCloseable인터페이스의 close() 메소드를 재정의 했다
			int i;
			while ( (i=fis.read()) !=-1) {	// EOF(End of File): -1
								// 파일의 마지막 끝까지 읽어 온다.	//IOEXception
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
