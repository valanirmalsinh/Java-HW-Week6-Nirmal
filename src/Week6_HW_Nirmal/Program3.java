package Week6_HW_Nirmal;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {
    int a = 19; // Instance variable
    static int b = 29; //Static Variable

    public void Method1() { //instance method
        System.out.println(a); //calling Instance variable in Instance method
        System.out.println(b); //calling Static variable in Instance method
    }

    public static void MyMethod() { //Static method
        Program3 obj = new Program3();
        System.out.println(obj.a); // calling Instance variable in the Static method with Object obj
        System.out.println(b); // calling Static variable in the Static method
    }

    public static void main(String[] args) {  //Main method
        Program3 obj1 = new Program3();
        obj1.Method1(); // Calling Instance method in the Main method with Object obj1
        MyMethod(); // Calling Static method in the Main method
    }
}
