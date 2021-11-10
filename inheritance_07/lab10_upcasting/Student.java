package inheritance_07.lab10_upcasting;

public class Student extends Person {
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
	
	@Override
	public void fly() {
		System.out.println("비행기를 타고 나릅니다. - Student ");
	}

}
