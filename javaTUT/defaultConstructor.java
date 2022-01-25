//Let us see another example of default constructor  
//which displays the default values  
class defaultConstructor {
    int id;
    String name;

    // method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        // creating objects
        defaultConstructor s1 = new defaultConstructor();
        defaultConstructor s2 = new defaultConstructor();
        // displaying values of the object
        s1.display();
        s2.display();
    }
}

// when compiler provides default constructor when you dont make any constuctor
// it gives 0 for numbers and null for string

// The Java compiler provides a default constructor if you don't have any
// constructor in a class.