package ControlStatement03;

import java.io.IOException;

public class WhileStatement {

	public static void main(String[] args) throws IOException {
		/*
		 * while문]
		 * 반복의 수가 정해져 있지 않을때 주로 사용
		 * 
		 * 형식]
		 * [초기식;]
		 * while(반복조건식) {
		 *     수행문;
		 *     [증감식;]
		 *     ...
		 * }
		 * 
		 * -초기식은 비교식 내지 논리식이어야한다.
		 * -조건식이 참일 동안 반복수행
		 * -초기식은 반드시 초기화해야한다.
		 * 
		 * 무한반복
		 * while(true){
		 *     수행문;
		 * }
		 */
		//1에서 10까지 누적합
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1에서 10까지 누적합:"+sum);
		System.out.println("while문이 끝난 후 i:"+i);
		
		/*
		 * 문]1부터 1000까지숫자중 3의 배수 이거나 5의 배수인
		 * 숫자의 합을 구해라
		 * 단, 3과 5의 공배수인 경우 제외(while문)
		 */
		i=1; sum=0;
		while(i<=1000) {
			if(i%3==0^i%5==0) sum+=i;
			i++;
		}
		System.out.println("1부터 1000까지숫자중 3의 배수 이거나 5의 배수의 합(공배수 제외):"+sum);
		
		System.out.println("문자열을 입력하세요.");
		char word;
		//사용자가 몇 자를 입력할지 모름으로 while문 사용(for문도 사용가능)
		while((word=(char)System.in.read())!=13) {
			System.out.println(word);
		}////while
		System.out.printf("%n");
		
		/*문]
		 * 
		 * 1 0 0 0 (1,1)
		 * 0 1 0 0 (2,2)
		 * 0 0 1 0 (3,3
		 * 0 0 0 1 (4,4) 처럼 출력해 보자(단, while문 사용)
		 */
		int r=1;
		while(r<=4) {
			int c=1;
			while(c<=4) {
				if(r==c) System.out.printf("1 ");
				else System.out.printf("0 ");
				c++;
			}
			System.out.println(); r++;
		}
		
		/*
		  문]
		 *
		 * *
		 * * *
		 * * * *
		 * * * * * 를 출력하여라(이중 while문 이용)
		 */
		r=1;
		while(r<=5) {
			int c=1;
			while(c<=r) {
				System.out.printf("* "); c++;
			}
			System.out.println(); r++;
		}

		/*
		  문]
		 * * * * *
		   * * * *
		     * * *
		       * *
		         * 를 출력하여라(이중 while문 이용)
		 */
		r=1;
		while(r<=5) {
			int c=1;
			while(c<=5) {
				if (c>=r)
					System.out.printf("* ");
				else System.out.printf("  ");
				c++;
			}
			System.out.println(); r++;
		}
		
		/*
		 * 문]아래 형식대로 구구단을 출력
		 * 2 * 1 = 2	3 * 1 = 3	4 * 1 = 4 ........9 * 1 = 9
		 * 2 * 2 = 4	3 * 2 = 6	4 * 2 = 8 ........9 * 2 = 18
		 * ..
		 * 
		 * ..
		 * 2 * 9 = 18	3 * 9 = 27	4 * 9 = 36 ........9 * 9 = 81
		 * 
		 * 단, while문 사용
		 */
		int j=1;
		while(j<=9) {
			i=2;
			while(i<=9) {
				System.out.printf("%d * %d = %d\t",i,j,i*j); i++;
			}
			System.out.println(); j++;
		}
		

	}/////main

}/////////class
