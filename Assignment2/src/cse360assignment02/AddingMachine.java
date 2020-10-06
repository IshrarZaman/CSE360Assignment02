package cse360assignment02;

/*
 * The AddingMachine program implements an application that stores a 'total' variable
 * and allows the user to add and subtract from the total. Every operation is stored in memory,
 * and the transaction history can be viewed by calling the toString() method. 
 * Additionally, the 'total' can be returned by calling the getTotal() method. Finally, the transaction
 * history can be cleared using the clear() method.
 * 
 * @author Ishrar Zaman
 * @version 1.0
 * @since 2020-10-05
 */

public class AddingMachine {
  private int total;
  private String transactionHistory = "0 ";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  //returns the current total
  public int getTotal () {
    return total;
  }
  
  //adds integer, value, to the total variable and stores the operation in transactionHistory
  public void add (int value) {
	  total = total + value;
	  transactionHistory = transactionHistory + "+ " + value + " ";
  }
  
  //subtracts integer, value, from the total variable and stores the operation in transactionHistory
  public void subtract (int value) {
	  total = total - value;
	  transactionHistory = transactionHistory + "- " + value + " ";
  }

  //prints out history of operations (transactionHistory) on the total variable
  public String toString () {
    return transactionHistory;
  }

  //clears memory (transactionHistory)
  public void clear() {
	  transactionHistory = "0 ";
  }
}