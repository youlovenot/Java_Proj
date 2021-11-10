package object06.lab;//213

public class Car {
	//필드
	String company="현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		this("","",0);
	}
	Car(String model){
		this(model,"",0);
	}
	Car(String model,String color){
		this(model,color,0);
	}
	Car(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}