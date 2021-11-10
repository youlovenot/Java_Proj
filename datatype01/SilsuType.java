package datatype01;

import java.math.BigDecimal;

public class SilsuType {

	public static void main(String[] args) {
		/* 부동소수점방식 :  가수부, 지수부
		 * 규칙1]정수형보다는 실수형이 더 큰 그릇이다.
		 * long(정수형):8byte, float(실수형):4byte		 */
		
		long ln = 100;
		float fl = 200;
		
		//long = ln+fl;[x] long형과 loat형 연산결과는 float
		float f1= ln+fl;
		System.out.println(f1);
		
		/* 규칙2]실수형에서 기본 데이타 타입은 double이다
		 *      소수점이 붙으면 무조건 double형으로 인식
		 *      단, 소수점이 붙지 않은 값은 float에 담을 수 있다 */
		
		//방법1]형변환
		float f2 = (float)3.14;
		
		System.out.println("f2:"+f2);
		//방법2]실수 뒤에 f,F를 붙인다.
		f2 = 3.14f;
		System.out.println("f2:"+f2);
		
		/* 규칙3]실수형도 같은 자료형끼리의 연산결과는
		 *      같은 자료형, 큰자료형과 작은 자료형과의
		 *      연산결과는 큰 자료형.		 */
		float f3 = 300, f4 = 400,f5;
		f5=f3+f4;
		System.out.println(f5);
		
		double d1=10.0,d2;
		//f2=f3+d1;[x] float형과 double형의 연산결과는 double형이기때문
		d2 = f3+d1;
		System.out.println("d2:"+d2);
		
		/* 문]
		 * 반지름이 10인 원의 면적을 구해라
		 * 단, 면적을 저장하는 변수의 타입을 3가지 형태(int/float/double)의
		 * 자료형에 저장하고 출력하여라 그리고 소수점을 제거하여라
		 * 원의 면적:반지름*반지름*3.14
		 * 단, 아래의 변수 radius와 pi를 사용하여 구해라
		 */
		int radius=10; double pi=3.14;
		int Ai = (int)(radius*radius*pi);
		float Af = radius*radius*(float)pi;
		double Ad = radius*radius*pi;
		System.out.println("int:"+Ai+"\nfloat:"+(int)Af+"\ndouble:"+(int)Ad);
		
		//부동소수 방식 연산오류
		double d11=0.1;
		double d12=0.2;
		
		System.out.println(d11+d12);
		System.out.println(d11*d12);
		System.out.println(d11+d12==0.3);
		
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal big3 = big1.add(big2);
		System.out.println("big3:"+big3);
		/*
		 * BigDecimal타입1.compareTo(BigDecimal타입2)
		 * 값이 같으면 0
		 * BigDecimal타입1 가리키는 값이 더 크면 1
		 * BigDecimal타입1 가리키는 값이 더 작으면 -1
		 */
		System.out.println(big3.compareTo(new BigDecimal("0.3")));

	}

}
