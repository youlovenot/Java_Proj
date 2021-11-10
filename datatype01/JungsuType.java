package datatype01;

public class JungsuType {
	public static void main(String[] args) {
		
		/*
		 * 원칙] 1. 큰자료형과 작은 자료형의 연산 결과는 큰 자료형을 따른다.
		 *      2. 같은 자료형끼리는 연산 결과는 같은 자료형이 된다.
		 *         예외] int형보다 작은 자료형(byte,short,char)들끼리 연산결과는 int형이다.
		 *              즉 적용이 안된다.
		 */
		//규칙1] 기본 자료형중 수치형의 정수형의 대표 자료형은 int
		byte b1=127; //변수 선언
		System.out.println(b1);
		
		b1=(byte)128;//[o]형변환. But 예상치 못한 값이 저장됨.
		System.out.println(b1);
		
		//규칙2] int형보다 작은 자료형(byte,short,char)들끼리 연산결과는 int형이다.
		byte b2=20, b3=30;
		//byte b4 = b2 + b3; //더하기 연산결과는 int형이다.(int형을 byte에 집어넣으려해서 오류인듯)
		int num1 = b2 + b3;
		System.out.println(num1);
		
		byte b4 = (byte)(b2+b3);
		System.out.println(b4);
		
		short s1=1000, s2=2000;
		//short s3 = s1 + s2;[x]
		num1 = s1+s2;
		System.out.println(num1);
		short s3 = (short)(s1+s2);
		System.out.println("s3:"+s3);
		
		/*
		 * 규칙3] 정수형에서 int형보다 작은 자료형들을 제외한
		 *       자료형들끼리(int,long)의 결과는 모두 원칙을 따른다.
		 *       즉 int형과 int형의 연산결과는 int형
		 *       long형과 long형의 연산결과는 long형
		 *       int형과 long형의 연산결과는 long형
		 */
		num1 = 1000;
		long ln1 = 2000;
		long ln2 = num1+ln1;
		
		// 22억(int형 초과)은 뒤에 L을 붙인다.
		long ln3 = 2200000000L;
		
		//규칙5]숫자 앞에0(영)이 붙으면 8진수를 의미한다
		int num4 = 0412;
		System.out.println(num4);
		//규칙6]숫자 앞에 0x(0X)가 붙으면 16진수를 의미
		num4 = 0x1F; //16*1 + 1*15 = 31
		System.out.println("num4:" + num4);
		
		//문제]
		//1]국어,영어,수학점수 및 점수 총합을 저장할 수 있는 변수 4개를 선언하여라(int형 사용)
		int Kor, Eng, Mat, Total;
		//2]국어에는 89, 영어에는 99, 수학은 78을 저장하여라
		Kor=89; Eng=99; Mat=78;
		//3]국영수의 총합을 구해서 1]번에서 선언한 총합 저장용 변수에 저장하여라
		Total=Kor+Eng+Mat;
		//4]각 국영수 점수 및 총합을 출력하여라.
		System.out.println("국어:"+Kor+", 영어:"+Eng+", 수학:"+Mat+"\n"
				+ "총합:"+Total);
		
		//점수 2100000000 + 2100000000
		int n1 = 2100000000;
		int n2 = 2100000000;
		int n3 = n1+n2;
		long n4 = (long)n1+(long)n2;
		System.out.println(n3);
		System.out.println(n4);
	
	}

}
