package Week6_HW_Nirmal;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    int a = 1; //Instance variable 1
    int b = 2; //Instance variable 2
    static int c = 3; //Static variable 1
    static int d = 4; //Static variable 2

    public void Method1() { //Instance method
        System.out.println(a); //calling Instance variable 1 in Instance Method
        System.out.println(b); //calling Instance variable 2 in Instance Method
        System.out.println(c); //calling Static variable 1 in Instance Method
        System.out.println(d); //calling Static variable 2 in Instance Method

    }

    public static void Method2() { // Static Method
        Program4 obj1 = new Program4();
        System.out.println(obj1.a); // Calling Instance variable 1 in Static Method with Object obj1
        System.out.println(obj1.b); // Calling instance variable 2 in Static Method with Object obj1
        System.out.println(c);      // Calling static Variable 1
        System.out.println(d);      // Calling static Variable 2
    }

    public static void main(String[] args) {
        Program4 obj2 = new Program4();
        obj2.Method1(); // Calling Instance Method in Main Method with Object obj2
        Method2(); // Calling Static Method in Main Method
    }

}
