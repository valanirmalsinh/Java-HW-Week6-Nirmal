package Week6_HW_Nirmal;

/**
 * Write a Java program to swap two variables.
 */
public class Program15 {
    public static void main(String[] args) {
        int a, b, c;
        a = 15;
        b = 10;

        System.out.println("Before swapping a = " +a +" b = " +b);
        c = a + b;
        b = c - b;
        a = c - a;
        System.out.println("After Swapping a = " +a+" b = "+b);
    }
}
