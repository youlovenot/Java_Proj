package basic_class_11.object;

public class Book1 {
	int bookNumber;			// 기본 데이터 타입
	String bookTitle;		// Wraper Class : 객체형 데이터 타입
	
	
	Book1 () {};	//기본 생성자, [ bookNumber <== 0, bookTitle <== Null ]
	Book1 (int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	
	@Override		// toString() 객체자체를 출력할때 작동되는 메소드
	public String toString() {
		return bookNumber + "." + bookTitle;
	}
	
	public static void main(String[] args) {
		Book1 book = new Book1(200,"개미");
		
		System.out.println(book);
		System.out.println(book.toString());
		
	}

}
