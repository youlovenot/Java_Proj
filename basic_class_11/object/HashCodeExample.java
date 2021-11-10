package basic_class_11.object;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		System.out.println(s1.equals(s2));
	}
	
	static class Student {
		int sno;
		String name;
		Student(int sno, String name){
			this.name = name;
			this.sno = sno;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Student) {
				Student std = (Student)obj;
				if(sno==std.sno&&name==std.name)
					return true;
				else
					return false;
			}
			return false;
		}
		
	}

}
