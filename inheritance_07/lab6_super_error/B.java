package inheritance_07.lab6_super_error;

public class B extends A{
		
	public B() {		//오류발생, 상위클래스에서 매개변수없는 생성자가 명시되지 않음
		super();	//생략됨
		System.out.println("생성자 B");
	}
		
}