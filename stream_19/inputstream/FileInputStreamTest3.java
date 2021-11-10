package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {	// A ~ Z: 26자

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i;
			while( (i=fis.read(bs)) != -1 ) {
				/*
				//향상된 for문: 마지막값을 자른 경우 뒤에 값이 붙어 올 숭 ㅣㅆ다.
				System.out.println("향상된 for문 사용");
				for (byte b:bs) {
					System.out.print((char)b);
				}
				System.out.println();
				*/
				
				System.out.println("for문을 사용해서 출력");
				for (int k=0; k<i; k++) {
					System.out.print((char) bs[k]);
				}
				System.out.println();
				
				System.out.println(+i+"바이트 읽음.\n");
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
