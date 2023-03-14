package Week6_HW_Nirmal;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as an input and prints its
 * multiplication table up to 10.
 */
public class Program10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = scan.nextInt();
        System.out.println(a + " * 1  = " + a*1);
        System.out.println(a + " * 2  = " + a*2);
        System.out.println(a + " * 3  = " + a*3);
        System.out.println(a + " * 4  = " + a*4);
        System.out.println(a + " * 5  = " + a*5);
        System.out.println(a + " * 6  = " + a*6);
        System.out.println(a + " * 7  = " + a*7);
        System.out.println(a + " * 8  = " + a*8);
        System.out.println(a + " * 9  = " + a*9);
        System.out.println(a + " * 10 = " + a*10);
        scan.close();
    }

}
