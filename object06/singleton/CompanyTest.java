package object06.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		
		
	//	Company myCompany1 = new Company();	//Company() 생성자가 private설정
											//외부 클래스에서 호출 할 수 없다.
	//	Company myCompany2 = new Company();
		
		Company myCompany1 = Company.getInstance();	//static키가 설정된 메소드
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1==myCompany2);
	}

}
