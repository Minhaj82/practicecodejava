/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		int num;
	    System.out.print("Enter an Integer number: ");

	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    input.close();

	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    if ( num % 2 == 0 )
	        System.out.println("....EVEN....");
	     else
	        System.out.println("....ODD....");
	    /*
	     *
         Scanner scan=new Scanner(System.in); 
         System.out.print("Enter the integer number: ");
         int num=scan.nextInt();
         switch(num%2)
         {
                case 0:
                    System.out.println(num+" is a Even number");
                    break;
                case 1:
                    System.out.println(num+" is a Odd number");
         }
    }
}
	     */
	}

}
