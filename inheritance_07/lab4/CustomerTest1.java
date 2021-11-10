package inheritance_07.lab4;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();		//부모 객체를 생성, 기본생성자 호출(등급:Silver)
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());	//고객정보출력 메소드 호출
		
		VIPCustomer customerKim = new VIPCustomer();	//자식 객체를 생성
		customerKim.setCustomerID(10020);		//부모클래스의 메소드
		customerKim.setCustomerName("김유신");	//부모클래스의 메소드
		customerKim.bonusPoint = 1000;			//부모클래스의 메소드
		System.out.println(customerKim.showCustomerInfo());
	}
}