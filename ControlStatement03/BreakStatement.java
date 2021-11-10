package ControlStatement03;

public class BreakStatement {

	public static void main(String[] args) {
		/*
		 * break문]
		 * switch-case문에서 break문을 만나면 다른 조건들을 비교하지않고 빠져나오는것 처럼
		 * 반복문에서도 더이상 반복문을 실행하지 않고 빠져나옵니다.
		 */
		//for문에서 break;
		//1부터 100까지 합
		int num=0,sum=0;
		for(num=0;num<=100;num++) {
			sum+=num;
		}
		System.out.println("sum:"+sum);
		System.out.println("num:"+num);
		
		//1부터 100까지 반복 합계중 합이 100이상이면, 반복문을 빠져나오시오.
		sum=0;
		for(num=0;num<=100;num++) {
			sum+=num;
			if (sum>=100) break;
		}
		System.out.println("sum:"+sum);
		System.out.println("num:"+num);
		
		//중첩문 for문에서 break문
		//break문이 사용된 루프문만 빠져나옴
		sum=0;
		for(num=0;num<2;num++) {
			System.out.println("outer");
			for(int num2=0;num2<5;num2++) {
				System.out.println("inner");
				if(num2>=2) break;
			}
		}
		//중첩문 for문에서 break문 라벨 사용시 중첩for문 모두 빠져나옴
		sum=0;
		outter:for(num=0;num<2;num++) {
			System.out.println("outer2");
			for(int num2=0;num2<5;num2++) {
				System.out.println("inner2");
				if(num2>=2) break outter;
			}
		}
		
		//while문에서 break문
		sum=0;
		num=1;
		while(num<=10) {
			if(num==5) break;
			sum+=num;
			num++;
		}
		System.out.println("sum:"+sum);//1+2+3+4
		
		//do-while문에서 break문
		sum=0;
		num=1;
		do {
			if(num==5) break;
			sum+=num;
			num++;
		}while(num<=10);
		System.out.println("do-while문 sum:"+sum);

	}/////main

}////class
