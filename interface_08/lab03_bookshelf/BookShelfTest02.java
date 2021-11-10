package interface_08.lab03_bookshelf;

public class BookShelfTest02 {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		for (int i=1;i<=100;i++) {				//책 100권을 책장에 넣음
			shelfQueue.enQueue("태백산맥 "+i+"권");
		}
		System.out.println("책장의 책의 수량: "+shelfQueue.getSize());
		System.out.println("================");
		
		for (int i=0;i<30;i++) {				//책 30권을 책장에서 빼내옴
			System.out.println(shelfQueue.deQueue());
		}
		System.out.println("책장의 책의 수량: "+shelfQueue.getSize());
		System.out.println("================");
	}

}
