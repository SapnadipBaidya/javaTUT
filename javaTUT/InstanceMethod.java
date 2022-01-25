/*
The method of the class is known as an instance method. It is a non-static method defined in the class. 
Before calling or invoking the instance method, it is necessary to create an object of its class.
*/
public class InstanceMethod {

    public int add(int a, int b) {// since we are not giving static here so.
        // we need to make object of the class in main method and access this method
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {

        // creating an object of the class
        InstanceMethod obj = new InstanceMethod();
        System.out.println(obj.add(5, 9));
    }
}
