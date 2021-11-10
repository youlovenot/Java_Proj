package object06.cooperation;

public class Student {
	public String name;		//학생이름
	public int grade;		//학년
	public int money;		//소지금액
	
	public Student(String name, int money) {	//학생이름과 가진돈을 초기화
		this.name=name;
		this.money=money;
	}
	public void takeBus(Bus bus) {		//버스를 탔을때
		bus.take(1000);			//버스의 수입을 증가, 버스에 돈을 지불
		this.money -= 1000;		//this.money = this.money - 1000
	}
	public void takeSub(Subway sub) {	//지하철을 탔을때
		sub.take(1500);			//지하철 요금을 지불
		this.money -= 1500;		//자신의 돈에서 1500원 지출
	}
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"입니다.");
	}
	
}
