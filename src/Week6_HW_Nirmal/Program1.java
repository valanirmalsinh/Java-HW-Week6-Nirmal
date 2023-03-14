package Week6_HW_Nirmal;

/**
 * 1.1 Declare 2 instance variables.
 * 1.2 Declare 1 instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1 {
    int a = 10; // instance variable 1
    int b = 20; // instance variable 2

    public void MyMethod() { //instance method
        Program1 obj = new Program1();
        System.out.println(obj.a); // calling instance variable 1 in the instance method
        System.out.println(obj.b); // calling instance variable 2 in the instance method
    }

    public static void main(String[] args) {
        Program1 obj1 = new Program1();
        obj1.MyMethod();
    }
}
