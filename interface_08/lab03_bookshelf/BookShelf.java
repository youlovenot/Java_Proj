package interface_08.lab03_bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);			//ArrayList [shelf]에 책을 추가
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);		// 책장에서 책을 빼내옴.
	}

	@Override
	public int getSize() {		//책장의 책의 갯수
		return getCount();			//shelf 클래스에 정의된 메소드 (shelf.size(): ArrayList 방의 갯수)
	}

}
