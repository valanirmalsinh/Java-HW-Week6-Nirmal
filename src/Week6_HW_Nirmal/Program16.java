package Week6_HW_Nirmal;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Program16 {
    public static void main(String[] args) {
        System.out.println(addBinary());
    }

    public static String addBinary() {
        String input1 = "10";
        String input2 = "11";

        int b1 = Integer.parseInt(input1, 2);
        int b2 = Integer.parseInt(input2, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
}

