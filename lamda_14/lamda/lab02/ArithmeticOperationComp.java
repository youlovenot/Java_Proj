package lamda_14.lamda.lab02;

public class ArithmeticOperationComp implements ArithmeticOperation {

	@Override
	public void ArithmeticOper(int a, int b) {
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		double div = (double) a/b;
		System.out.println("a + b = " + sum + "\na - b = " + sub +
				"\na * b = " + mul + "\na / b = " + div);
		
	}

}
