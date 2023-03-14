package Week6_HW_Nirmal;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class program17 {
    public static void main(String[] args) {
        int a = 5;
        //converting decimal number to binary number using Integer.toBinaryString()
        String output = Integer.toBinaryString(a);
        System.out.println(output);
    }
}
