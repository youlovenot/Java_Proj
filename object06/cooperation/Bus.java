package object06.cooperation;

public class Bus {
	int bNum;		//버스번호
	int passenger;	//승객수
	int income;		//수입
	
	public Bus (int bNum) {
		this.bNum = bNum;
	}
	
	public void take(int money) {
		income += money;	//income = income + money
							//기존의 버스 수입에서 요금을 추가해서 다시 메모리에 저장
		passenger++;		//승객수를 1명 증가
	}
	public void showInfo() {
		System.out.println(bNum+"번 버스의 승객은 "+passenger+"명이고, 수입은 "+
				income+"원 입니다.");
	}

}
