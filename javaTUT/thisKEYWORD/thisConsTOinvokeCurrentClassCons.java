/*The this() constructor call can be used to invoke the current class constructor.
 It is used to reuse the constructor. In other words, it is used for constructor chaining. */
class A {
    A() {
        System.out.println("hello a");
    }

    A(int x) {
        this();// invoke the current class constructor. ie hello a prints out
        System.out.println(x);
    }
}

public class thisConsTOinvokeCurrentClassCons {
    public static void main(String args[]) {
        A a = new A(10);
    }
}