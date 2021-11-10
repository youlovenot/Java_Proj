package array05;

import java.util.Scanner;

public class ArrayAccess {	//양의 정수 5개를 입력 받아서 배열에 저장하고 제일 큰수를 출력하는 프로그램
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max=0;
		System.out.print("양의 정수 5개를 입력 하세요 >> ");
		for (int i=0;i<intArray.length;i++) {
			intArray[i] = scanner.nextInt();
			if (intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
		scanner.close();
	}
}
