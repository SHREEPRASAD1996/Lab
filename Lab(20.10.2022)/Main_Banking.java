package com.java;
public class Main_Banking {
	public static void main(String[] args) {
		BankingOperation obj = new BankingOperation(12345,"Abhisek",81400); // first customer
		BankingOperation obj2 = new BankingOperation(13974,"Devid",45400); // second customer 
        System.out.println("First customer");  // for first customers 
		System.out.println("Now");
		obj.getAmount();   // at first main balance in your account 
		obj.setAmount(5000);
        System.out.println("After add amount ");

		obj.getAmount();  // after adding then the total balance 
		
		obj.withdrawAmount(4000);
        System.out.println("After withdraw amount ");

		obj.getAmount();  // after with draw then total balance
		
		System.out.println("Second customer");
		System.out.println("Now");
		obj2.getAmount();
		obj2.setAmount(10000);
        System.out.println("After add amount ");

		obj2.getAmount();
		
		obj2.withdrawAmount(14000);
        System.out.println("After withdraw amount ");

		obj2.getAmount();
	}
	
}
