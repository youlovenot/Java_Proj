package basic_class_11.class_ex;

public class Person {
	private String name;
	private int age;
	
	public Person () {}					//기본 생성자
	public Person (String name) {		//생성자: 매개변수 1개
		this.name = name;
	}
	public Person (String name, int age) {	//생성자: 매개변수 2개
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
