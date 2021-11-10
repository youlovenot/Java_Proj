package stream_19.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\data.txt");	//기반 스트림.
		FileInputStream fis = new FileInputStream("C:\\Temp\\data.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);	//보조 스트림, 
		DataInputStream dis = new DataInputStream(fis);
			//다양한 형식의 자료형을 처리, 주의: 아웃풋 자료형과 인풋 자료형이 동일해야됨.
		
			//오라클(MS-SQL, My-SQL) = > HTML,CSS,JavaScript, JSP, Spring, 리엑스, 파이썬....
			// ppt <== 다음주 월요일 까지 제출
		
		dos.writeByte(100);		//byte로 출력
		dos.writeChar('A');		//char 자료형을 출력
		dos.write(10);		//int 출력
		dos.writeFloat(3.14f);	//float 출력
		dos.writeDouble(3.14159);	//double 출력
		dos.writeUTF("안녕하세요.");	//String을 처리
		System.out.println("입력 완료");
		
		System.out.println("=====인풋해서 출력=====");
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.read());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
	}

}
