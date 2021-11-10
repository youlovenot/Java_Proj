package array05;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];	//Book의 객체배열을 저장할 방을 5개 생성
		
		library[0] = new Book("태백산맥","조정례");
		library[1] = new Book("데미안","헤르만 헤세");
		library[2] = new Book("어떻게 살것인가?","유시민");
		library[3] = new Book("토지","박경리");
		library[4] = new Book("어린왕자","생텍쥐 페리");
		
		for(int i=0;i<library.length;i++) {
			library[i].showBookInfo();			//객체의 메소드를 호출해서 객체정보를 출력.
		}
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);		//객체의 주소값만 저장되어 있다.
		}
	}
}