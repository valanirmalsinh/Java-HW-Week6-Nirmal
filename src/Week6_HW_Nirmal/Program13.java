package Week6_HW_Nirmal;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Program13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for number1:");
        int a = scan.nextInt();
        System.out.println("Enter a value for number2:");
        int b = scan.nextInt();
        System.out.println("Enter a value for number3:");
        int c = scan.nextInt();
        System.out.println("Average of Number 1, Number 2 and Number 3 is "+(a+b+c)/3);
        scan.close();
    }
}
