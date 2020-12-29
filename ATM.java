/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ATM {	
	static double balance = 0;
	
	public static void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Your current balance is: "+balance);
	}
	public static void withdraw(double amount) 
	{
        if(balance >= amount)
        {
        	balance-=amount;
            System.out.println("Your current balance is: "+balance);
        }
        else
        {
            System.out.println("Insufficient Balance\n\t Now Deposite time");
        }

	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(" 1 Deposit ");
		System.out.println(" 2 Withdraw ");
		System.out.println(" 3 Balance ");
		System.out.println(" 4 Exit ");
		System.out.println("");
		
        Scanner s = new Scanner(System.in);
        
        while(true)
        {
        	int choice;
    		double amount;
    		System.out.println("Choice your option: ");
        	choice = s.nextInt();
        	
            switch(choice)
            {
                case 1:
                	System.out.println("Enter deposite ammount ");
                	amount = s.nextDouble();
                     deposit(amount);
                         break;
 
                case 2:
                	System.out.println("Enter withdraw ammount ");
                	amount = s.nextDouble();
                	withdraw(amount);
                    break;
                        
                case 3:
                	System.out.println("Your current balance is: "+balance);
                      break;
                      
                case 4:
                System.exit(0);
                    break;
                    
            }
        }            
	}

    
}
