package com.yash.atmManagement.serviceImpl;

import java.util.Scanner;

import com.yash.atmManagement.service.ATMService;

public class ATmServiceImpl implements ATMService{

	Scanner s = new Scanner(System.in);
	int balance=0, withdraw, deposit; 
	
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
		System.out.print("Enter money to be withdrawn:");
		withdraw = s.nextInt();
		if (balance >= withdraw) {
			balance = balance - withdraw;
		System.out.println("Please collect your money");
		
		} else {
			System.out.println("Insufficient Balance");
		}
       //	System.out.println("");
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.print("Enter money to be deposited:");
		deposit = s.nextInt();
		balance = balance + deposit;
		System.out.println("Your Money has been successfully depsited");
		//System.out.println("");
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance : " + balance);
		//System.out.println("");
		
	}
	
	
}
