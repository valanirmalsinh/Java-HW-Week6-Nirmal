package Week6_HW_Nirmal;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2 {

    static int a = 5; // static variable 1
    static int b = 7; // static variable 2

    public static void MyMethod() { //static method
        System.out.println(a); // calling static variable 1 in static method
        System.out.println(b); // calling static variable 2 in static method
    }

    public static void main(String[] args) {

        MyMethod(); //calling static method in the Main method
    }
}
