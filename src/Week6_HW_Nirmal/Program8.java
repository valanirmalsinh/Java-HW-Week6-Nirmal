package Week6_HW_Nirmal;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Program8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Base of the Triangle:");
        double B = scan.nextDouble();
        System.out.println("Please enter the Height of the Triangle:");
        double H = scan.nextDouble();
        double ans = (B/2)*H;
        System.out.println("Area of the Triangle is : " +ans);
        scan.close();
    }
}
