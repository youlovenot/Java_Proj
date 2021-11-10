package inheritance_07.lab13.fruit;

import java.util.ArrayList;

public class FruitEx {
	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		Fruit banana = new Banana();
		
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		
		for (Fruit fruit : fruitList) {
			System.out.println(fruit.fruitInfo());
		}
	}
}
