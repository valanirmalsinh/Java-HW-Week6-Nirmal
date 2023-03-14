package Week6_HW_Nirmal;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Program9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter text in Uppercase:");
        String text = scan.nextLine();
        System.out.println(text.toLowerCase());
        scan.close();
    }
}
