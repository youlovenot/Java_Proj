package array05;

public class ObjectCopy1 {

	public static void main(String[] args) {	//객체 배열 복사 : 주소만 복사가 된다.(얕은 복사)
		Book[] bookArray1 = new Book[3];	//객체배열 방 3개 생성
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥","조정래");
		bookArray1[1] = new Book("데미안","헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가?","유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		bookArray1[0].setBookName("바뀜");
		
		for (int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
