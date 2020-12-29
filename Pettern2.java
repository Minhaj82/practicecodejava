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
public class Pettern2 {
	/*Print the following pattern:
		*
		+++
		*****
		+++++++
		*********
		*/
	public static void main(String[] args) {
		int i, j;
        for(i=1;i<=10;i+=2)
        {
            for (j=1;j<=i;j++)
            {   
                switch(i)
                {
                    case 1: case 5: case 9:                
                    System.out.printf("*");
                }                
                  switch(i)
                {
                   case 3: case 7: 
                   System.out.printf("+");
                }
            }             
            System.out.println();
        }
	}
	
}

