package inheritance_07.abstract_template;

public abstract class Car {		//추상 클래스
	
	public abstract void drive();		//추상메소드, 하위클래스에서 오버라이딩
	public abstract void stop();		//추상메소드, 하위클래스에서 오버라이딩
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {	//템플릿 메소드 : 하위 클래스에서 오버라이딩 할 수 없다.
		startCar();				// 프로그램의 로직을 사용.
		drive();
		stop();
		turnOff();
	}

}
