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

public class Sumcalculate {

	public static void main(String[] args) 
	{
		int n, num, i=1, sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        while(i<=n)
        {
           num = in.nextInt();
           sum = sum + num;
           ++i;
        }  
        in.close();
       System.out.println(sum);
	}
	
}

