package exception_10.custom_Exception.p431_442;

public class TryWithResourceExample {	//AutoCloseable 구현 클래스

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}

	}

}
