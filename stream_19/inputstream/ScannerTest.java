package stream_19.inputstream;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scanner.nextLine();	//String 데이터를 인풋 받음
		System.out.print("직업: ");
		String job = scanner.nextLine();
		System.out.print("나이: ");
		int age = scanner.nextInt();
		System.out.println("사각형의 폭(더블형):");
		double width = scanner.nextDouble();
		
		System.out.println("===== 출력 결과 =====");
		System.out.println(name);
		System.out.println(job);
		System.out.println(age);
		System.out.println(width);
	}

}
