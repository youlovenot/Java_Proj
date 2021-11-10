package operator02;

public class BeekyoOP {

	public static void main(String[] args) {
		/*
		 * 비교연산자(이항연산자)의 결과는 true아니면 false(boolean값)
		 * > : ~보다 크다
		 * >=: ~보다 크거나 같다
		 * < : ~보다 작다
		 * <=: ~보다 작거나 같다
		 * !=: ~과 다르다
		 * ==; ~과 같다
		 * 비교연산자는 모두 우선 순위가 같다
		 * 산술연산자가 비교연산자보다 우선순위가 높다.
		 * 비교 연산자를 사용한 식은 비교식
		 */
		int num1=10,num2=20;
		System.out.println(num1>num2);
		System.out.println(num1<=num2);
		System.out.println(num1!=num2);
		System.out.println(num1==num2);
		System.out.println((num1+20)>=(num2+10));
		
		System.out.println(10.0d==10.0f);//true
		System.out.println(0.1d==0.1f);//false
		System.out.println(0.1d);
		System.out.println(0.1f);
		
		double d=(double)0.1f;
		System.out.println(d);
		float f1=(float)0.1;
		System.out.println(f1);
		
		boolean b =!true || true ^ false && true;
		System.out.println("b="+b);
		
		System.out.println('A'==65);
		System.out.println('A'<'B');
		
		

	}

}
