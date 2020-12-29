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
public class Vowel {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
        String str = input.nextLine(); 
        input.close();

        System.out.println(count_Vowels(str));
    }
    public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'
            		|| str.charAt(i) == 'u'|| str.charAt(i) == 'A' || str.charAt(i) == 'E' 
                    || str.charAt(i) == 'I'|| str.charAt(i) == 'O' || str.charAt(i) == 'U')
            {
                count++;
            }           
        }
        return count;

	}

}
