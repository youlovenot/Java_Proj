package inheritance_07.lab13.fruit;
public class Fruit {
	private String name;
	private String color;
	private int size;
	
	public Fruit(String name, String color, int size) {
		this.name=name; this.color=color; this.size=size;
	}
	
	public String fruitInfo() {
		return name+"은(는) "+color+"이며 크기는 "+size+"입니다.";
	}
}
