package exception_10.ex;

import java.util.Scanner;

public class CompleteCalc extends Calculator implements Calc {
	
	int a; int b;
	
	public CompleteCalc(int a, int b) {
		this.a = a; this.b = b;
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int times(int a, int b) {
		return a*b;
	}

	@Override
	int substract(int a, int b) {
		return a-b;
	}

	@Override
	double divide(double a, double b) {
		if (b==0)
			throw new ArithmeticException();
		return a/b;
	}

	@Override
	public String toString() {
		return "a + b = " + add(a,b) + "\na * b = " + times(a,b) +
				"\na - b = " + substract(a,b) + "\na / b = " + divide(a,b);
	}
	
	public static void main(String[] args) {
			//Calc 인터페이스를 구현, Calculator 추상 클래스를 구현 합니다
			//스캐너로 두개의 정수를 인풋 받아서, 객체 자체를 print 했을 때, 사칙 연산이 모두 출력
			// a / b: b가 0인 경우 Exception 발생, ArithmeticException
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a> ");
		int a = scanner.nextInt();
		System.out.print("b> ");
		int b = scanner.nextInt();
		
		CompleteCalc cal = new CompleteCalc(a, b);
		try {
			System.out.println(cal);
		} catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("b에는 0이 아닌 수를 넣으세요");
		}
		System.out.println("프로그램 종료");
	}
	
}
