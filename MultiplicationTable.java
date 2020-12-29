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

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		int a, b, c, d;

	    System.out.print("Enter range of numbers multiplication tables: ");
	    Scanner in = new Scanner(System.in);

	    a = in.nextInt();
	    b = in.nextInt();
	    in.close();

	    for (c = a; c <= b; c++) {
	      System.out.println("Multiplication table of "+c);

	      for (d = 1; d <= 10; d++) {
	        System.out.println(c+"*"+d+" = "+(c*d));
	      }	      
	    }
	    System.out.println();

	}

}

