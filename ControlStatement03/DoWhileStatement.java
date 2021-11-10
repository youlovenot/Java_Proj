package ControlStatement03;

public class DoWhileStatement {

	public static void main(String[] args) {
		/*
		 * do-while
		 * 
		 * 형식]
		 * [초기식;]
		 * do{
		 *     수행문1;
		 *     [증감식;]
		 *     ...
		 * } while(조건식);
		 * 
		 * -조건식은 비교식 내지 논리식이어야한다.
		 * -무조건 한번은 수행한다. 그외에는 while문과 동일하다 즉 조건식 참일동안 반복 수행
		 * -초기식은 반드시 초기화해야된다.
		 */
		
		//1에서 10까지 누적합
		int i=1;
		int sum=0;
		do sum+=i++; while(i<=10);
		
		System.out.println("1에서 10까지 누적합:"+sum);
		System.out.println("do-while문이 끝난 후 i:"+i);
		
		/*문]
		 * 1 0 0 0 (1,1)
		 * 0 1 0 0 (2,2)
		 * 0 0 1 0 (3,3)
		 * 0 0 0 1 (4,4) 처럼 출력해 보자(이중 do-while문 이용)
		 */
		int r=1;
		do {
			int c=1;
			do {
				if(r==c)System.out.printf("1 ");
				else System.out.printf("0 "); c++;
			}while(c<=4);
			System.out.println(); r++;
		}while(r<=4);
		
		/*
		  문]
		 *
		 * *
		 * * *
		 * * * *
		 * * * * * 를 출력하여라(이중 do-while문 이용)
		 */
		r=1;
		do {
			int c=1;
			do {
				System.out.printf("* "); c++;
			}while(c<=r);
			System.out.println(); r++;
		}while(r<=5);
		
		/*
		 * 문]아래 형식대로 구구단을 출력
		 * 2 * 1 = 2	3 * 1 = 3	4 * 1 = 4 ........9 * 1 = 9
		 * 2 * 2 = 4	3 * 2 = 6	4 * 2 = 8 ........9 * 2 = 18
		 * ..
		 * 
		 * ..
		 * 2 * 9 = 18	3 * 9 = 27	4 * 9 = 36 ........9 * 9 = 81
		 */
		int j=1;
		do {
			i=2;
			do {
				System.out.printf("%d * %d = %d\t",i,j,i*j); i++;
			} while(i<=9);
			System.out.println(); j++;
		} while(j<=9);

	}/////main

}////class
