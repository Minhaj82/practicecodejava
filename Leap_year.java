/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		int year;
		   Scanner input = new Scanner(System.in);
		    year = input.nextInt();
		    input.close();
		        
		   if (year % 400 == 0 || year % 4 == 0) {
		      System.out.printf("%d is a leap year.",year);
		   }
		   else if (year % 100 == 0) {
		      System.out.printf("%d is not a leap year.",year);
		   }
		   //else if (year % 4 == 0) {
		   //System.out.printf("%d is a leap year.", year);
		   //}
		   else {
		      System.out.printf("%d is not a leap year.", year);
		   }
	}

}

