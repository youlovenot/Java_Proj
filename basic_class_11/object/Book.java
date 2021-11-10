package basic_class_11.object;

public class Book {
	int bookNumber;			// 기본 데이터 타입
	String bookTitle;		// Wraper Class : 객체형 데이터 타입
	
	
	Book (){};	//기본 생성자, [ bookNumber <== 0, bookTitle <== Null ]
	Book(int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book (200,"roal");
		
		System.out.println(book1);				//객체 자체를 출력할 경우: Object Class의 to String() 출력
		System.out.println(book1.toString());
			//Object Class의 toString() 메소드는 객체의 주소를 출력해줍니다.
			// 객체의 전체이름 (패키지이름.클래스이름)@해쉬코드(주소)
	}

}
