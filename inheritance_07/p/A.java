package inheritance_07.p;

public class A {
	private int pri;		//private 접근 제한자	: 같은 클래스내에서만 호출/사용
	int def;				//[default] 접근 제한자	: 같은 패키지내에서 호출/사용 
	protected int pro;		//protected 접근 제한자	: 상속된 다른패키지 호출/사용
	public int pub;			//public 접근 제한자	: 다른 패키지에서 호출/사용
	
	public void setA() {
		pri=5;
	}
}