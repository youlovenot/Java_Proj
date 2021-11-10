package inheritance_07.lab10_polymorphism;

public class Tiger extends Animal {
	
	@Override
	public void move() {	//오버라이딩된 메소드
		System.out.println("호랑이는 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}

}
