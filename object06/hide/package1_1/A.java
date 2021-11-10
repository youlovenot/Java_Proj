package object06.hide.package1_1;

public class A {
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a = new A("문자열");
	
	//생상자
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}

}
