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

public class SumDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);    
        int n = input.nextInt();
        input.close();
        
        if (n>0)
        {
           System.out.print(+(n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
        }
        System.out.println("\n");  
	}

}

