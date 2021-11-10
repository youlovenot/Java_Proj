package lamda_14.lamda.lab02;

import java.util.Scanner;

public class ArithmeticOperationTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 값을 넣으세요. >");
		int a = sc.nextInt();
		int b = 0;
		while(true) {
			try {
				System.out.println("두번째 값을 넣으세요. >");
				int num2 = sc.nextInt();
				if (num2==0) throw new ArithmeticException("두번째 값은 0이 아닌 수를 입력하세요.");
				b = num2;
				break;
			} catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		System.out.println();
		
		System.out.println("1. 객체지향으로 출력하기");
		ArithmeticOperationComp comp01 = new ArithmeticOperationComp();
		comp01.ArithmeticOper(a, b);
		System.out.println();

		System.out.println("프로그램 종료");
		
		System.out.println("2. 람다식으로 출력하기");
		ArithmeticOperation comp02 = (n1, n2) -> {
			int sum=n1+n2;
			int sub=n1-n2;
			int mul=n1*n2;
			double div=(double)n1/n2;
			System.out.println("a + b = " + sum + "\na - b = " + sub +
					"\na * b = " + mul + "\na / b = " + div);
		};
		comp02.ArithmeticOper(a, b);
		System.out.println();
		
		System.out.println("3. 익명 내부 객체로 출력 하기");
		new ArithmeticOperation() {
			
			@Override
			public void ArithmeticOper(int num1, int num2) {
				int sum=num1+num2;
				int sub=num1-num2;
				int mul=num1*num2;
				double div=(double)num1/num2;
				System.out.println("a + b = " + sum + "\na - b = " + sub +
						"\na * b = " + mul + "\na / b = " + div);
			}
		}.ArithmeticOper(a, b);
		sc.close();
	}

}
