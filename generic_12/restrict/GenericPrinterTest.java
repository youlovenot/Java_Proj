package generic_12.restrict;

public class GenericPrinterTest {

	public static void main(String[] args) {
		System.out.println("==========플라스틱 재료로 프린팅===========");
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());	//객체 생성
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println(plastic);
		plastic.doPrinting();
		
		System.out.println("===========파우더 재료로 프린팅===========");
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		System.out.println(powder);
		powder.doPrinting();
		
		System.out.println("=============물 재료로 프린팅============");
/*		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		waterPrinter.setMaterial(new Water());
		Water water = waterPrinter.getMaTerial();
		System.out.println(waterPrinter);
		System.out.println(water);
		water.doPrinting();
*/
	}

}
