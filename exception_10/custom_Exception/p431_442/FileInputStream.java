package exception_10.custom_Exception.p431_442;

public class FileInputStream implements AutoCloseable {	//AutoCloseable 구현 클래스
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
		
	}
	
}
