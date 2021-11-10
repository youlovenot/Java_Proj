package array05.enum_ex;

import java.awt.Window.Type;

public class MainStringArrayArgument {	//main()메소드에 args인자로 값을 던져 추가
	public static void main(String[] args) {
		if (args.length!=2) {
			System.out.println("프로그램의 사용법");
	//		System.out.println("java MainStringArrayArgument num1 num2");
			System.out.println("반드시 정수값 2개를 arg인자로 넣으세요. 예) 10 20");;
			System.exit(0);		//프로그램을 강제 종료.
		}
		String StrNum1 = args[0];
		String StrNum2 = args[1];
		System.out.println(StrNum1+StrNum2);	//(문자열)40 + (문자열)50 = 4050
		
		int num1 = Integer.parseInt(StrNum1);	//숫자로된 문자열을 정수형으로 타입변환
		int num2 = Integer.parseInt(StrNum2);
		
		int result = num1+num2;
		System.out.println("num1 + num2 = "+result);
		System.out.println(StrNum1.getClass().getSimpleName());
		System.out.println(StrNum1.getClass().getName());
	}
}
