package datatype01;

public class VariableDeclaration {
	public static void main(String[] args) {
		System.out.println("[변수 선언 방법 첫 번째]");
		//자료형(data type)변수명
		int num; //int형(숫자-정수) 저장할 수 있는 num이라는 이름의 메모리를 할당해주세요.
		num = 10; //변수 초기화
		
		int bNum = 0B1010; //2진수(0b)
		int oNum = 012; //8진수(0)
		int hNum = 0xA; //16진수(0x)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		System.out.println("[변수 선언 방법 두 번쨰]");
		int initNum = 200; //선언과 동시에 초기화
		System.out.println(initNum);
		
		System.out.println("[변수 선언 방법 세번째-동시에 같은 타입의 변수 여러개 선언하기]");
		int fnum,snum=300,tnum; //fnum과 tnum은 선언만 snum은 선언과 동시에 300값 할당(초기화)
		
		//System.out.println(fnum); [x] fnum 초기화 안돼서 오류
		fnum = snum;
		
		System.out.println(fnum);
		
		//fnum = snum + tnum; [x] tnum 초기화 안돼서 오류
		tnum = 500;
		System.out.println(snum+tnum);
		
		/* 항상 = (대입(할당)연산자) 의 왼쪽에는
		 * 값을 변경할 수있는 변수가 와야한다.
		 * 오른쪽에는 값이나 값이 저장된 변수가 온다.*/
		
		int fNum; //자바는 대소문자를 엄격히 구분한다.
		
		/* 2]명명 규칙에 어긋나는 경우
		 * 2-1] 숫자로 시작하는 경우
		 * 2-2] _나 $를 제외한 특수문자 포함시
		 * 2-3] 예약어를 사용하는 경우*/
		
		int you4;
		int _underbar, under_bar, underbar_;
		int $dollor, doll$or, dollor$;
		//int #sharp; [x]
		int puBlic; //[o] 대소문자를 구분함.(public은 예약어라 안됌)
		
		int studentName; //카멜규칙(각 단어의 첫글자만 대문자표기) 변수명 선언
	}
}
