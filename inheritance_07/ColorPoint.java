package inheritance_07;

public class ColorPoint extends Point{	//Point 클래스를 상속받는 ColorPoint 자식클래스
	private String color;		//점의 색
	
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {	//컬러점의 좌표를 출력
		System.out.println(color);
		showpoint();			//부모클래스에서 상속받은 메소드 호출
	}
}