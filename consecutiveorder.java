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
public class consecutiveorder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }
      // 12;
      // 1 2 4 4 4 7 3 3 3 6 5 7;
        for(int i=0; i<(n-2); i=i+1)
        {
            if(a[i]==a[i+1] && a[i+1]==a[i+2] && a[i+2]==a[i+3] )
            {
                System.out.print(a[i]+" ");
            }
        }
        in.close();  
        
	}
	
}
