package Week6_HW_Nirmal;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */
public class Program7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// Scanner statement
        System.out.println("Enter a temperature Value in Fahrenheit:");//Asking the Fahrenheit value
        int F = scan.nextInt();
        System.out.println("Temperature value in Celsius is : " + (F - 32) * 5 / 9);//Displaying  value in Celsius
        scan.close();
    }
}