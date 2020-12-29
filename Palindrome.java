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
public class Palindrome {
	public static void main(String[] args) {
		
		String a, b = "";
        Scanner s = new Scanner(System.in);
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--) 
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.printf("%s is a Palindrome.",a);
        }
        else
        {
            System.out.printf("%s is not a Palindrome.",a);
        }
        s.close();

	}

}

