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

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = in.next().charAt(0);
        in.close();

        double result;

        switch(operator)
        {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", a, operator, b, result);
    }
}
