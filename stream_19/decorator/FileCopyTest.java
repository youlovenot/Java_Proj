package stream_19.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	// C:\\Temp\\a.exe	==> C:\\Temp\\b.exe
	
	public static void main(String[] args) throws IOException {
		//FileInputStream : 바이트 스트림. 1바이트씩 읽어서 처리.
		FileInputStream fis = new FileInputStream("C:\\Temp\\a.exe");
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\b.exe");
		
		long millisecond = 0;		// 복사되는 전체 시간을 출력(ms)
		millisecond = System.currentTimeMillis();	//현재의 시간을 ms 단위로 저장
		
		int i;
		int j=0;	//총 바이트
		while ( (i = fis.read()) != -1 ) {		//fis: 원본, 1byte씩 읽는
			fos.write(i);						//fos: 대상, 1byte씩 쓴다.
			j++;
		}
		
		millisecond = System.currentTimeMillis() - millisecond;			//전체 복사 시간(ms)
		System.out.println("복사하는데 걸리는 시간은 " + millisecond + "ms 소요 되었습니다.");
		System.out.println("총 복사한 데이터는 " + j + "byte 입니다.");
	}

}
