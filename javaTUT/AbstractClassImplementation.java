/* The method that does not has method body is known as abstract method. 
In other words, without an implementation is known as abstract method. 
It always declares in the abstract class.
 It means the class itself must be abstract if it has abstract method.
  To create an abstract method, we use the keyword abstract.*/

abstract class AbstractedClass {// abstract class
    // abstract method declaration
    abstract void display();
}

public class AbstractClassImplementation extends AbstractedClass {
    // method impelmentation || defination
    void display() {
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        AbstractClassImplementation obj = new AbstractClassImplementation();
        obj.display();
    }
}
