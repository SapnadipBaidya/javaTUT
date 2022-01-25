//Java Program to demonstrate the use of a static method.  
class staticMethod {
    int rollno;
    String name;
    static String college = "ITS";

    // static method to change the value of static variable
    static void change() {
        college = "BBDIT";
    }

    static {
        System.out.println("static block is invoked");
        /*
         * Is used to initialize the static data member.
         * It is executed before the main method at the time of classloading.
         */
    }

    // constructor to initialize the variable
    staticMethod(int r, String n) {

        rollno = r;
        name = n;
    }

    // method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

// Test class to create and display the values of object
public class TestStaticMethod {
    public static void main(String args[]) {
        staticMethod.change();// calling change method
        // creating objects
        staticMethod s1 = new staticMethod(111, "Karan");
        staticMethod s2 = new staticMethod(222, "Aryan");
        staticMethod s3 = new staticMethod(333, "Sonoo");
        // calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}