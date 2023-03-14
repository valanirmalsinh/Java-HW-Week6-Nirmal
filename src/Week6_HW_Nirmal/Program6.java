package Week6_HW_Nirmal;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Program6 {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scan = new Scanner(System.in);// Scanner statement
        System.out.println("Enter a radius Value : ");//Asking the radius value
        int r = scan.nextInt();
        System.out.println("Area of the Circle is: " + pi*r*r);//Area formula
        scan.close();
    }
}
