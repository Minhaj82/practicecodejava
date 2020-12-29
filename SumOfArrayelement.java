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
public class SumOfArrayelement {
    public static void main(String[] args) {
		int arr[][]={{3,2,4},{4,9,6},{9,11,0}}; 
	      for (int i = 0; i < 3; i++)
	      { 
	        int sum = 0; 
	        for (int j = 0; j < 3; j++)
	        { 
	            sum = sum + arr[j][i]; 
	        } 
	        System.out.println(sum); 
	    } 

	}
    
}
