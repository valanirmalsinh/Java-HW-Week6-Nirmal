package Week6_HW_Nirmal;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {

    int a = 55; //Instance Variable 1
    int b = 5; //Instance Variable 2

    public void Addition() { //Instance Method 1
        System.out.println("Addition of a + b = " + (a + b));
    }

    public void Substraction() { // Instance Method 2

        System.out.println("Substraction of a - b = " + (a - b));
    }

    public static void Multiplication() { //Static Method 1
        Program5 obj = new Program5();
        System.out.println("Multiplication of a * b = " + (obj.a * obj.b));
    }

    public static void Division() { //Static Method 2
        Program5 obj = new Program5();
        System.out.println("Division of a / b = " + (obj.a / obj.b));
    }

    public static void main(String[] args) {
        Program5 obj1 = new Program5();
        obj1.Addition(); // Calling Instance method 1
        obj1.Substraction(); //Calling Instance method 2
        Multiplication(); // Calling Static method 1
        Division(); //Calling Static method 2
    }
}
