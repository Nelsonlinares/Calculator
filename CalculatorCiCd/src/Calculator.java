
public class Calculator {

	public int multiply(int a, int b) {
		return a*b;
	}
	
	public double division(int a, int b) {
		if (b==0) {
			throw Arithmetic Exception("No se puede dividir entre 0");
		}
		return (double) a/b;
	}

	public int adition(int a, int b) {
		return a+b;
	}
	
	public int substraction(int a, int b) {
		return a-b;
	}

}
