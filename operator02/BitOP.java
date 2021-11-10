package operator02;

public class BitOP {

	public static void main(String[] args) {
		/*
		 * 논리합(&)
		 * 0 & 0: 0
		 * 0 & 1: 0
		 * 1 & 0: 0
		 * 1 & 1: 1
		 * 논리곱(|)
		 * 0 | 0: 0
		 * 0 | 1: 1
		 * 1 | 0: 1
		 * 1 | 1: 1
		 * 
		 * [쉬프트(shift) 연산자(이항연산자)]
		 * -두 항이 반드시 정수여야한다.
		 * 정수 << 비트수: 왼쪽으로 비트수만큼 이동하고
		 *              오른쪽에 남은 비트는 0으로 채운다.
		 * 정수 >> 비트수: 오른쪽으로 비트수만큼 이동하고
		 *              왼쪽에 남은 비트는 부호비트로 채운다(1:음수, 0:양수)
		 */
		byte num1 = 45;
		byte num2 = 25;
		//byte result = num1&num2;[x] 비트 연산결과는 int형임
		int result = num1&num2;
		System.out.println(result);
		
		/*
		 * 10 : 00001010
		 * <<
		 * 2
		 */
		byte b1=10, bit1=2;
		result = b1 <<bit1;
		System.out.println(result);
		
		b1=-9;
		result=b1>>bit1;
		System.out.printf("%d>>%d의 결과: %d%n",b1,bit1,result);
		
		b1=-3;
		bit1=3;
		result = b1>>>bit1;
		System.out.printf("%d>>>%d의 결과: %d%n",b1,bit1,result);
		

	}

}
