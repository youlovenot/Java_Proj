package inheritance_07.lab9;	//다형성 구현 : 메소드 오버라이딩
class Shape {		//슈퍼클래스, 메소드 재정의[오버라이딩]를 사용해서 다형성을 구현
	public Shape next;		//객체선언, Shape : 객체형 데이터 타입, next : 인스턴스 변수
	public Shape() {next=null;}		//생성자
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	@Override
	public void draw() {			//오버라이딩
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {			//오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {			//오버라이딩
		System.out.println("Circle");
	}
}
