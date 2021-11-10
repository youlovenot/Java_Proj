package stream_19.other;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Temp\\newFile.txt");
				// File : 파일 생성, 속성을 알려줌.
		file.createNewFile();	//지정된 경로에 파일을 생성해주는 File클래스의 createNewFile();
		
		System.out.println(file.isFile());	//파일이 지정된 경로에 존재하면 true, 아니면 false
		System.out.println(file.isDirectory());	// 폴더(true), 파일(false)
		System.out.println(file.getName());		// 파일 이름을 가져온다.
		System.out.println(file.getAbsolutePath());	//파일의 저장되어 있는곳의 절대 경로 출력
										// C:\\Temp\\newFile.txt
		
										//절대 경로: 
											//Windows	: c:\, d:\
											//Linux		: /(루트) 부터 경로가 정의
		System.out.println(file.getPath());
										//상대 경로: 특정 폴더를 기준으로 출력
		System.out.println(file.canRead());	// 읽을 권한이 있는가?
		System.out.println(file.canWrite());
		
		file.delete();		//지정된 경로의 파일을 삭제
		
		System.out.println(file.isFile());
		
	}

}
