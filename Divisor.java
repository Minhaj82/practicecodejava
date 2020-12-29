/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) 
	{
		 int num;
	      Scanner in = new Scanner (System.in);
	      num = in.nextInt ();
	      in.close();

	      System.out.print ("Factors of " + num + " are: ");

	      for (int i = 1; i <num; ++i)
	      {
	    	  if (num % i == 0)
	    	  {
	    		  System.out.print (i + " ");
	    		  }
	    	  }

	}

}

