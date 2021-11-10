package ControlStatement03;

public class ForStatement {
	
	public static void main(String[] args) {
		/*
		 * for문] 어떤 명령문들을 반복하고자 할때 사용하는 제어문
		 * 
		 * 형식:
		 * for(초기화식;반복조건식;증감식){
		 *     실행문
		 * }
		 * 
		 * -초기화식: 최초 한번 실행됨
		 * -반복조거닉: 조건식을 만족할동안 계속 반복
		 * -증감식: 한번 수행 할때마다 증감
		 * 
		 * -실행문이 하나일때 {} 생략가능
		 * 
		 *  1]초기화식 생략
		 *  int i=0;
		 *  for(;조건식;증감식){
		 *      실행문
		 *  }
		 *  2]조건식 생략
		 *  for(초기화;;증감식){
		 *  	실행문; break; //빠져 나온다
		 *  }
		 *  
		 *  3)증감식 생략
		 *  for(초기화;조건식;){
		 *  	실행문; i++; //증감식 실행문 안에서 증가
		 *  }
		 *  4]무한반복(모두생략)
		 *  for(;;){
		 *  
		 *  {
		 *  
		 *  for(;true;){
		 *  
		 *  }
		 *  
		 *  -for문은 반복횟수가 정해진 경우 주로 사용한다.
		 *   반대로 반복횟수를 모를 경우에는 while문을 사용한다
		 */
		//반복문을 이용해서 1부터 10까지 누적합:1+2+3+4+5+6+7+8+9+10
		int sum=0;//누적합을 저장할 변수
		for (int i=1;i<=10;i++) {
			sum +=i;
		}
		System.out.println("1부터 10까지 누적합:"+sum);
		
		//방법1]1부터 10까지 숫자중 2의 배수의 합:
		sum=0;
		for (int i=0;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println("1부터 10까지 2의 배수의 합:"+sum);
		
		//방법1]1부터 10까지 숫자중 2의 배수의 합:
		sum=0;
		for (int i=1;i<=10;i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println("1부터 10까지 2의 배수의 합:"+sum);
		
		//System.out.println("for문이 끝난후 i값:"+i);[x] i는 for문안에서만 유효한 변수
		//for블락 밖에 i를 초기식으로 사용
		int i=1;
		for(;i<=10;i++) {}
		
		System.out.println("for문이 끝난후 i값:"+i);//[o]
				
		for(int k=0;k>0;k--) {
			System.out.println("Hello world!");
		}
		
		/*
		 * 문]1부터 100까지 숫자중 3의 배수이거나 5의 배수인 숫자의 합을 구해라
		 * 
		 * 3+5+6+9+10+12+15+18+2+21+24.......
		 */
		sum=0;
		for(int k=1;k<=100;k++) {
			if(k%3==0||k%5==0) sum+=k;
		}
		System.out.println("1부터 100까지 3의 배수 이거나 5의 배수합:"+sum);
		
		/*
		 * 문]1부터 100까지 숫자중 3의 배수 이거나 5의 배수인 숫자의 합을 구해라
		 * 단, 3과 5의 공배수는 제외시켜라
		 * 즉 15,30,45,60...은 제외
		 * 
		 * 3+5+6+9+10+12+18+20+21+24......
		 */
		sum=0;
		for(int k=1;k<=100;k++) {
			if(k%3==0^k%5==0) sum+=k;
		}
		System.out.println("1부터 100까지 3의 배수 이거나 5의 배수합(공배수제외):"+sum);
		
		/*
		 * 중첩for문(이중for문):for문 안의 for문
		 * 이중 for문에서 바깥for문은 행을 의미
		 * 이중 for문에서 안쪽for문은 열을 의미
		 */
		for(int j=0;j<2;j++) {
			for(int k=0;k<2;k++) System.out.println("Hello World!");
		}
		
		/*문]
		 * 0 0 0 1 (1,4)
		 * 0 0 1 0 (2,3)
		 * 0 1 0 0 (3,2)
		 * 1 0 0 0 (4,1) 처럼 출력해 보자
		 * 단, 이중 for문 사용
		 */
		System.out.println("[행, 열 출력]");
		for(int j=1;j<=4;j++) {
			for(int k=1;k<=4;k++) {
				if(j+k==5) System.out.printf("1 ");
				else System.out.printf("0 ");
			}
			System.out.println();//줄바꿈
		}
		
		/*
		
		*
		* *
		* * *
		* * * *
		* * * * * 를 출력하여라(이중 for문 사용) 
		 */
		for(int j=1;j<=5;j++) {
			for(int k=1;k<=j;k++)
				System.out.printf("* ");
			System.out.println();
		}
		/*
		
		        *
		      * *
		    * * *
		  * * * *
		* * * * * 를 출력하여라(이중 for문 사용) 
		 */
		for(int j=1;j<=5;j++) {
			for(int k=1;k<=5;k++) {
				if(j+k<6) System.out.printf("%-2c",' ');
				else System.out.printf("%-2c",'*');
			}
			System.out.println();
		}
		
		/*
		 * 문]아래 혀익대로 구구단을 출력
		 * 2 * 1 = 2	3 * 1 = 3	4 * 1 = 4 ........9 * 1 = 9
		 * 2 * 2 = 4	3 * 2 = 6	4 * 2 = 8 ........9 * 2 = 18
		 * ..
		 * 
		 * ..
		 * 2 * 9 = 18	3 * 9 = 27	4 * 9 = 36 ........9 * 9 = 81
		 */
		System.out.println("[구구단 출력]");
		for(int j=1;j<=9;j++) {
			for(int k=2;k<=9;k++)
				System.out.printf("%d * %d = %d\t",k,j,k*j);
			System.out.println();
		}
		
		//무한루프
		for(;;) {
			System.out.println("무한루프");
			break;//무한루프 탈출
		}
		
		
	}/////main

}/////////class
