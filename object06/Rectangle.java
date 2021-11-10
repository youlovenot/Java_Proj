package object06;

import java.util.Scanner;

public class Rectangle {			//넓이와 높이를 입력 받아서 넓이(면적)를 구하는 프로그램
	int width;		//넓이
	int height;		//높이
	
	//public Rectangle() {}		//기본 생성자는 생략가능(단, 다른 생성자가 없는 경우, 외부에서 호출하지 않는 경우)
	
	public int getArea() {		//int값을 리턴시켜주는 getArea메소드
		return width*height;
	}///getArea

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 "+rect.getArea());
		
		scanner.close();

	}///main

}///class
