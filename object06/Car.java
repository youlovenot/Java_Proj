package object06;

public class Car {	// 생성자(메소드) 오버로딩 : 같은 이름의 생성자에서 인풋값에따라 다르게 호출
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	
	Car(String model){	// input매개변수 이름, 할당하는 변수이름, 메모리의 변수이름
		this.model=model;
	}
	
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}

	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

}
