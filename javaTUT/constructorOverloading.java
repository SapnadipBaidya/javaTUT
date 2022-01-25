/*In Java, a constructor is just like a method but without return type.
It can also be overloaded like Java methods.Constructor overloading in Java is a technique of having 
more than one constructor with different parameter lists. 
They are arranged in a way that each constructor performs a different task. 
They are differentiated by the compiler by the number of parameters in the list and their types. */

public class constructorOverloading {
    public int id;
    public String name;
    public int age;

    constructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    constructorOverloading(int i, String n, int a) {
        this.id = i;
        this.name = n;
        this.age = a;
    }

    public void display2() {
        System.out.println(this.id + " " + this.name);
    }

    public void display3() {
        System.out.println(this.id + " " + this.name + " " + this.age);
    }

    public static void main(String[] args) {
        constructorOverloading s1 = new constructorOverloading(111, "Sapnadip Baidya");
        constructorOverloading s2 = new constructorOverloading(222, "Ananya Baidya", 20);

        s1.display2();
        s2.display3();
    }
}
