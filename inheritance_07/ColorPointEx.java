package inheritance_07;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point ();				//Point객체 생성 = p
		p.set(1, 2);
		p.showpoint();
		
		System.out.println(p);	//객체 자신을 출력했을때 객체의 주소를 출력함.
		
		ColorPoint cp = new ColorPoint();	//ColorPoint객체 생성 = cp
								//cp는 Point객체의 필드나 메소드를 재사용 할 수 있다.
		cp.set(3, 4);			//cp객체는 set()메소드가 없다. 상속된 메소드
		cp.setColor("red");
		cp.showColorPoint();
		
		System.out.println(cp);	//객체 자신을 출력했을때 객체의 주소를 출력함.
	}
}