/*
 * static: You can make a method static by using the keyword static. We should
 * call the main() method without creating an object. Static methods are the
 * method which invokes without creating the objects, so we do not need any
 * object to call the main() method.
 */
/*
Public: The method is accessible by all classes when we use public specifier in our application.


Private: When we use a private access specifier, 
the method is accessible only in the classes in which it is defined.


Protected: When we use protected access specifier, 
the method is accessible within the same package or subclasses in a different package.


Default: When we do not use any access specifier in the method declaration,
 Java uses default access specifier by default. It is visible only from the same package only.
*/

/*
It is also possible that a method has the same name as another method name in the same class,
 it is known as method overloading.
 */

/*A method that has static keyword is known as static method. In other words,
 a method that belongs to a class rather than an instance of a class is known as a static method*/

public class functionsMain {
    public static void main(String[] args) {
        System.out.println("hello this is from main method");
    }

}
