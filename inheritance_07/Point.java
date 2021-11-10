package inheritance_07;
public class Point {	//{x, y}의 한 점을 표현하는 Point클래스와 이를 상속받아
						//	색을 가진 점을 표현하는 ColorPoint클래스
						// 부모 클래스
	private int x, y;		//한 점을 구성하는 점의 좌표값
	
	public void set(int x, int y) {		//메소드로 좌표값 변수에 적용함
		this.x = x;
		this.y = y;
	}
	
	public void showpoint() {
		System.out.println("("+x+","+y+")");
	}
}