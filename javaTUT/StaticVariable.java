/*Suppose there are 500 students in my college,
 now all instance data members will get memory each time when the object is created. 
 All students have its unique rollno and name, so instance data member is good in such case.
  Here, "college" refers to the common property of all objects.
   If we make it static, this field will get the memory only once.*/

public class StaticVariable {
    int rollno;// instance variable
    String name;
    static String college = "Lovely Professional University";// static variable
    // constructor

    StaticVariable(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticVariable[] s = new StaticVariable[5];
        s[0] = new StaticVariable(1, "Sapnadip Baiyda");
        s[1] = new StaticVariable(2, "Sankalan Baidya");
        s[2] = new StaticVariable(3, "Saranya Baidya");
        s[3] = new StaticVariable(4, "Soma Baidya");
        s[4] = new StaticVariable(5, "Dibyendu Baidya");
        // StaticVariable s1 = new StaticVariable(1, "Sapnadip Baidya");
        // StaticVariable s2 = new StaticVariable(2, "Sankalan Baidya");
        // StaticVariable s3 = new StaticVariable(3, "Saranya Baidya");
        // StaticVariable s4 = new StaticVariable(4, "Soma Baidya");
        // StaticVariable s5 = new StaticVariable(5, "Dibyendu Baidya");

        for (int i = 0; i <= 4; i++) {
            s[i].display();
        }
    }
}
