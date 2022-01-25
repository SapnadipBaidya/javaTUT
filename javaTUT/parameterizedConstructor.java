public class parameterizedConstructor {
    public int id;
    public String name;

    // creating a parameterized constructor
    parameterizedConstructor(int i, String n) {
        id = i;
        name = n;
    }

    // method to display the values
    public void display() {
        System.out.println(this.id + " " + this.name);
    }

    public static void main(String[] args) {
        // creating objects and passing value
        parameterizedConstructor s1 = new parameterizedConstructor(111, "Sapnadip Baidya");
        parameterizedConstructor s2 = new parameterizedConstructor(222, "Ananya Baidya");
        // calling method to display the values of object
        s1.display();
        s2.display();
    }
}
