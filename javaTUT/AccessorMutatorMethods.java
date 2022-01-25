/*
Accessor Method: The method(s) that reads the instance variable(s) is known as the accessor method. 
We can easily identify it because the method is prefixed with the word get. It is also known as getters. It returns the value of the private field. It is used to get the value of the private field.

Example////////////////////

public int getId()    
{    
return Id;    
}

////////////////////////////

Mutator Method: The method(s) read the instance variable(s) and also modify the values. 
We can easily identify it because the method is prefixed with the word set. It is also known as setters or modifiers. It does not return anything. It accepts a parameter of the same data type that depends on the field. It is used to set the value of the private field.

Example////////////////////

public void setRoll(int roll)   
{  
this.roll = roll;  
}  

*/

public class AccessorMutatorMethods {
    // example of a student class
    private int roll;
    private String name;

    public int getRoll() {// accessor method
        return roll;
    }

    public void setRoll(int roll) {
        // mutator method
        /* this.roll means private int roll */ this.roll = roll; /* this is the parameter */
    }

    public String getName() {// accessor method
        return name;
    }

    public void setName(String name) {
        // mutator method
        /* this.name means private String name */ this.name = name; /* this is the parameter */
        // void since this method returns nothing
    }

    public void display() {
        System.out.println("Roll no is : " + roll);
        System.out.println("Name no is : " + name);
    }

    public static void main(String[] args) {
        AccessorMutatorMethods obj = new AccessorMutatorMethods();

        obj.setRoll(19);
        System.out.println(obj.getRoll());// getRoll returns the value
        obj.setName("Sapnadip Baidya");
        System.out.println(obj.getName());
    }
}
