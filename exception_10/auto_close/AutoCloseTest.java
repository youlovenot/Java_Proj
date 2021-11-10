package exception_10.auto_close;

public class AutoCloseTest {		// 예외가 발생되지 않는 경우 (정상 처리)

	public static void main(String[] args) {	//try (resource) {}
		
		try( AutoCloseObj obj = new AutoCloseObj() ){
			
		} catch(Exception e) {
			System.out.println("예외 블락 입니다.");
		}
		System.out.println("프로그램 종료");
	}

}
