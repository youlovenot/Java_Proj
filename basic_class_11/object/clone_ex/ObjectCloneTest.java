package basic_class_11.object.clone_ex;

class Point{
	int x;	// 점의 좌표: x 좌표
	int y;	// 점의 좌표: y 좌표
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {			//객체를 출력할때 toString()메소드가 출력
		return "x = "+x+", y = "+y;
	}
}
class Circle implements Cloneable {		//Circle 클래스는 객체 복제를 허용: impliments Cloneable
	Point point;		// 객체변수 point 선언
	int radius;			// 반지름
	
	public Circle (int x, int y, int radius) {		//생성자
		point = new Point(x,y);
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "원점은 "+point+"이고, 반지름은 "+radius+"입니다.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {	// clone() 메소드 오버라이딩
		return super.clone();
	}
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle (10, 20, 30);	//객체 생성
		
		Circle copyCircle = (Circle)circle.clone();		//객체 복사
		
		System.out.println(circle);			//객체의 원본
		System.out.println(copyCircle);		//객체의 복사본
		
		System.out.println(System.identityHashCode(circle));	//객체의 주소가 각각 다릅니다.
		System.out.println(System.identityHashCode(copyCircle));
	}

}
