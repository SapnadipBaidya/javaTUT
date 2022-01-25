/*Real usage of this() constructor call
///////////////////////////////////////////
The this() constructor call should be used to reuse the constructor from the constructor. 
It maintains the chain between the constructors i.e. it is used for constructor chaining.
 Let's see the example given below that displays the actual use of this keyword. */
class Student {
    int rollno;
    String name, course;
    float fee;
    String grade;

    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student(int rollno, String name, String course, float fee) {
        this(rollno, name, course);
        this.fee = fee;
    }

    Student(int rollno, String name, String course, float fee, String grade) {
        this(rollno, name, course, fee);// if this line is removed and placed below this.grade=grade
        this.grade = grade;
        // this(rollno, name, course, fee); ->leads to an error
        // rule:Call to this() must be the first statement in constructor.
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee + " " + grade);
    }

}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student(111, "ankit", "java");
        Student s2 = new Student(112, "sumit", "java", 6000f);
        Student s3 = new Student(114, "bunty", "java", 7000f, "A+");
        s1.display();
        s2.display();
        s3.display();
    }
}
