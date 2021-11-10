package generic_12;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		
		Powder powder = powderPrinter.getMaTerial();
		System.out.println(powderPrinter);
		System.out.println(powder);
		
		System.out.println("==========================");
		
		GenericPrinter<Plastic> plasticPtinter = new GenericPrinter<Plastic>();
		plasticPtinter.setMaterial(new Plastic());
		
		Plastic plastic = plasticPtinter .getMaTerial();
		System.out.println(plasticPtinter);
		System.out.println(plastic);
		
		System.out.println("==========================");
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		waterPrinter.setMaterial(new Water());
		
		Water water = waterPrinter.getMaTerial();
		System.out.println(waterPrinter);
		System.out.println(water);
		
	}

}
