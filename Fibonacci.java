/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int num1 = 0;
        int num2 = 1;
        int fibo;
        scanner.close();
        
        System.out.print(num1+" "+num2);

        for(int i= 3; i<=n; i++)
        {
            fibo = num1 + num2;
            System.out.print(" "+fibo);
            num1 = num2;
            num2 = fibo;
        }
        
	}

}
