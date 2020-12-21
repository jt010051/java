package calculator;

import java.util.Scanner;

import calculator.operations.AddOperation;
import calculator.operations.DivideOperation;
import calculator.operations.MultiplyOperation;
import calculator.operations.SubstractOperation;

public class InteractiveCalculator {

	/**
	 * - two numbers as inputs
		- take the operator 
			add / substract / divide / multiply
		
		- print the result to console
	 * @param args
	 */
	
	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number A please:");
		double numberA = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Give me a number B please:");
		double numberB = scanner.nextDouble();
		System.out.println("Give me a operation please(+, -, *, or /):");
		scanner.nextLine();
		String operation = scanner.nextLine();
		
		double result = 0;
		if (operation.equals("+")) {
			AddOperation add = new AddOperation();
			add.setA(numberA);
			add.setB(numberB);
			result = add.getResult();
		} else if (operation.equals("-")) {
			SubstractOperation substract = new SubstractOperation();
			substract.setA(numberA);
			substract.setB(numberB);
			result = substract.getResult();
		} else if (operation.equals("*")) {
			MultiplyOperation multiply = new MultiplyOperation();
			multiply.setA(numberA);
			multiply.setB(numberB);
			result = multiply.getResult();
		} else if (operation.equals("/")) {
			   if (numberB == 0){ 
System.out.println("Illegal Operation: End of Program");
}
			    else {
			    	DivideOperation divide = new DivideOperation();
					divide.setA(numberA);
					divide.setB(numberB);
					
					result = divide.getResult();
			    }
			
		
			
			
		} else {
			System.out.println("Illegal Operation: End of Program");
		}

		System.out.println("The result is");
		System.out.println(result);
		
	}
	
}