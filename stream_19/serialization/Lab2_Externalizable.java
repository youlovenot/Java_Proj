package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Animal implements Externalizable {
	String name;		// Externalizable로 처리, (C:\\Temp\\Animal.dat)
	int age;			// 객체 2개(사자:10, 호랑이:20) 직렬화해서 저장, 읽어오기, 두변수 모두
	
	public Animal() {}		// <== 직렬화 할때 기본 생성자
	public Animal(String name,int age) {
		this.name = name; this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ", " + age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
	}
	
}

public class Lab2_Externalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Animal Lion = new Animal("사자",10);
		Animal Tiger = new Animal("호랑이",20);
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\Animal.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Lion);
		oos.writeObject(Tiger);
		
		System.out.println("===== 직렬화 성공 =====");
		
		oos.close();
		
		System.out.println("=== 직렬화된 파일에서 값 읽어 오기 ===");
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\Animal.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Animal a1 = (Animal) ois.readObject();
		Animal a2 = (Animal) ois.readObject();
		
		System.out.println(a1);
		System.out.println(a2);
		
		ois.close();
	}

}
