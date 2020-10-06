package cse360assignment02;

/*
 * The test program simply tests all the methods from the AddingMachine class.
 * It creates an instance of AddingMachine and calls the add(), subtract(), toString(),
 * getTotal() and clear() methods.
 * 
 * @author Ishrar Zaman
 * @version 1.0
 * @since 2020-10-05
 */

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddingMachine myCalculator = new AddingMachine();
		
		System.out.println("Testing AddingMachine addition and subtraction :");
		
		myCalculator.add (4); 
		myCalculator.subtract(2); 
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		
		System.out.println("Testing AddingMachine getTotal :");
		System.out.println(myCalculator.getTotal());
		
		System.out.println("Testing AddingMachine clear :");
		
		myCalculator.clear();
		System.out.println(myCalculator.toString());
	}

}
