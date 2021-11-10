package ControlStatement03;

import java.io.IOException;

public class ifStatement03 {
	
	public static void main(String[] args) throws IOException {
		/*
		 * if문 기본형식3]
		 * if(조건식1) {
		 *     조건식1이 참일때 실행할 명령문1
		 * }
		 * else if(조건식2) {
		 *     조건식2가 참일때 실행할 명령문2
		 * }
		 * ......................
		 * else if(조건식) {
		 *     조건식n이 참일때 실행할 명령문n
		 * }
		 * else {
		 *     모든 조건식이 거짓일때 실행할 명령문
		 * }
		 */
		int kor=99, eng=80, math=89;
		double avg=(kor+eng+math)/3.0;
		
		if(avg>=90) System.out.println("A학점");
		else if(avg>=80) System.out.println("B학점");
		else if(avg>=70) System.out.println("C학점");
		else if(avg>=60) System.out.println("D학점");
		else System.out.println("F학점");
		
		System.out.println("한 문자를 입력하세요?");
		char word = (char)System.in.read(); System.in.skip(2);
		/*문]
		 * 숫자인지 판단 후 2의 배수를 판단하고
		 * 2의 배수면 "2의 배수"출력, 아니면 "2의 배수가 아님"을 출력
		 * 또한 숫자가 아니고 알파벳이라면 대소문자를 판단한 후
		 * 대문자인 경우 "대문자" 출력, 소문자인 경우 "소문자"출력
		 * 단, if ~else if()만 이용
		 */
		if(word>='0'&&word<='9'&&(word-'0')%2==0)
			System.out.println("2의 배수");
		else if(word>='0'&&word<='9'&&(word-'0')%2!=0)
			System.out.println("2의 배수가 아님");
		else if(word>='A'&&word<='Z') System.out.println("대문자");
		else if(word>='a'&&word<='z') System.out.println("소문자");
		
		/*문]
		 * 입력받은 문자가 숫자면 "숫자"
		 * 알파벳이면 "알파벳"
		 * 숫자도 알파벳도 아니면 "기타"를 출력하여라.
		 * if ~else if ~else 사용
		 */
		word = (char)System.in.read(); System.in.skip(2);
		
		if (word>='0'&&word<='9') System.out.println("숫자");
		else if (word>='A'&&word<='Z'||word>='a'&&word<='z')
			System.out.println("알파벳");
		else System.out.println("기타");
		
		/*문] (종합) 세숫자 중 최대 값을 구하는
		 *   로직을 작성하자 (if문 형식 3가지중 아무거나 사용가능)
		 *   System.out.println("최대값:" + 44);*/
		int num1=44, num2=55, num3=55;
		
		int max = num1;
		if(num2>max) max=num2;
		if(num3>max) max=num3;
		System.out.println("최대값:"+max);
		
	}

}
