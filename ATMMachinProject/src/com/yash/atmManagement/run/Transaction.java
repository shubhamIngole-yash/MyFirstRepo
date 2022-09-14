package com.yash.atmManagement.run;

import java.util.Scanner;
import com.yash.atmManagement.service.ATMService;
import com.yash.atmManagement.serviceImpl.ATmServiceImpl;

public class Transaction {

	public static void main(String args[]) {
		
		ATMService asc=new ATmServiceImpl();
		Scanner s = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("*****************************************************");
			System.out.println("* WELCOME TO IDBI ATM *");
			System.out.println("*****************************************************");
			
			System.out.println("Choose 1 for Deposit ");
			System.out.println("Choose 2 for Withdraw");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
		    System.out.println("------------------------------------------------------");
			System.out.print("Choose the operation you want to perform:");
			
			
			int n = s.nextInt();
			
			switch (n) {
			
			case 1:
				asc.deposite();
				break;

			case 2:
				asc.withdraw();
				break;

			case 3:
				asc.checkBalance();
				break;

			case 4:
				System.exit(0);
			}
		}
	}

}
