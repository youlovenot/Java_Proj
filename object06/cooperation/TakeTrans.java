package object06.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 두명을 생성해서 버스와 지하철을 탑승
		Student stdJames = new Student("James",5000);	//제임스학생 객체생성
		Student stdTomas = new Student("Tomas",10000);	//토마스학생 객체생성
		Student stdKim = new Student("Kim",20000);
		Bus bus100 = new Bus(100);
		stdJames.takeBus(bus100);		//James가 100번 버스를 탐
		stdJames.showInfo();
		bus100.showInfo();
		
		Subway subGreen = new Subway("2호선");
		stdTomas.takeSub(subGreen);		//Tomas가 2호선을 탐
		stdTomas.showInfo();
		subGreen.showInfo();
		
		stdKim.takeBus(bus100);
		stdKim.takeSub(subGreen);
		stdKim.showInfo();
		bus100.showInfo();
		subGreen.showInfo();

	}

}
