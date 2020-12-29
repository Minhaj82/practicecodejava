/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArrayTax {
    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	       int sum = 0;
	       int[] arr = new int[6];
	       for(int i=0; i<5; i++){
	           arr[i] = input.nextInt();
	           sum = sum + arr[i];
	       }
	       double avg = sum/6.0;
	       int count = 0;
	       for(int i=0; i<6; i++){
	           if(arr[i]>avg) count++;
	       }
	       double per = (count*100)/6.0;
	       input.close();
	    
	        System.out.printf("%.2f", per);
	        System.out.print("%");
	}
    
}
