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

public class GCD {

	public static void main(String[] args) {
		int n1, n2, k = 3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        n2 = sc.nextInt();

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
                k = i;
        }
        System.out.printf("\nGCD of %d and %d is %d", n1, n2, k);
        
        sc.close();
        
	}
	
}
