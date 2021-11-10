package object06.cooperation;

public class Subway {
	public String lNum;	//노선번호
	public int passenger;	//승객수
	public int income;		//수입
	
	public Subway (String lNum) {		//생성자. 초기값으로 호선
		this.lNum = lNum;
	}
	
	public void take(int money) {		//지하철의 수입을 처리하는 메소드
		income += money;			//this.money = this.money + money
		passenger++;
	}
	public void showInfo() {
		System.out.println(lNum+"의 승객은 "+passenger+"명이고, 수입은 "+
				income+"원 입니다.");
	}

}
