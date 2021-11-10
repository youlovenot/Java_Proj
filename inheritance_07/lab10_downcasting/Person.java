package inheritance_07.lab10_downcasting;

public class Person {	//슈퍼클래스
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}

	public void fly() {
		System.out.println("하늘을 나릅니다. - Person");
	}

}
