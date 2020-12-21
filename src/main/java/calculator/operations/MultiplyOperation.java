package calculator.operations;

public class MultiplyOperation {

	double a = 0;
	double b = 0;
	
	public void setA(double numberA) {
		this.a = numberA;
	}
	
	public void setB(double numberB) {
		this.b = numberB;
	}
	
	public double getResult() {
		return this.a * this.b;
	}
	
}