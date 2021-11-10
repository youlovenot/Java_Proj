package generic_12.ex01;

public class Point<T, V> {		//제너릭 클래스, 두점의 좌표를 입력 받아서, 좌표와 넓이를 구함
	
	T x;
	V y;
	
	Point (T x, V y){		//생성자
		this.x=x;
		this.y=y;
	}
	
	public T getX() {		// x변수 값을 리턴
		return x;
	}
	public V getY() {		// y변수 값을 리턴
		return y;
	}

}
