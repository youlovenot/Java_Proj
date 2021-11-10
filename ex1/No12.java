package ex1;

import java.util.Scanner;

public class No12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		//스케너 객체 생성
		System.out.print("양의 정수 10개를 입력하시오 >> ");	//문자열 출력
		int[] arr = new int[10];			//정수 값 10개를 받는 arr배열변수 선언
		for (int i=0;i<arr.length;i++)		//인풋받은 정수 10개를 배열의 각 방에 저장
			arr[i]=sc.nextInt();
		System.out.print("3의 배수는");
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%3==0)							//arr의 각방을 3으로 나누었을때 나머지가 0이라면 출력
				System.out.printf(" %d",arr[i]);
		}
		sc.close();
	}
}
