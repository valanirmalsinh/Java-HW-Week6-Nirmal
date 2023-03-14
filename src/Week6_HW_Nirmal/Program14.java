package Week6_HW_Nirmal;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Width of the Triangle :");
        double Width = scan.nextDouble();
        System.out.println("Enter the Height of the Triangle :");
        double Height= scan.nextDouble();
        System.out.println("Area of the Triangle is " + Width*Height);
        System.out.println("Perimeter of the Triangle is "+ 2 * (Width+Height));
        scan.close();
    }
}
