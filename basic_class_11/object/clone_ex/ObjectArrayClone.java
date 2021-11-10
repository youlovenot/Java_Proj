package basic_class_11.object.clone_ex;

import java.util.ArrayList;ㅜ

class MyBook implements Cloneable {
	String title;
	public MyBook (String title) {
		this.title = title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return title;
	}
	
}

public class ObjectArrayClone {
	public static void main(String[] args) {
		ArrayList<MyBook> bookList = new ArrayList<MyBook>();	//ArrayList 선언, 생성
		MyBook book1 = new MyBook("자바");
		MyBook book2 = new MyBook("안드로이드");
		MyBook book3 = new MyBook("파이썬");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		ArrayList<MyBook> copyList = (ArrayList) bookList.clone();		//ArrayList 복사
		copyList.add(new MyBook ("C++"));	// Copy된 ArrayList C++ 추가
		
		System.out.println(bookList);
		System.out.println(copyList);
		System.out.println("===================");
		
		book3.setTitle("C언어");				// ArrayList에는 객체 자체가 아니라 객체의 주소가 저장됨
		System.out.println(bookList);
		System.out.println(copyList);
		
	}
}