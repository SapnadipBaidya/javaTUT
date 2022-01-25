public class StringEquals {
    public static void main(String[] args) {
        String a = new String("wow");
        String b = new String("wow");// String b = "wow"; <--same alternate way
        String sameA = a;
        // When we are using objects and want to check if they are equal, the operator
        // == will say if they are the same
        boolean r1 = a == b;// if you want to check if they are logically equal, you should use the equals
                            // method on the object
        boolean r2 = a.equals(b);// The operator == works a bit different on objects than on primitives
        boolean r3 = a == sameA;// both are the same string object || since a in assigned with sameA

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
