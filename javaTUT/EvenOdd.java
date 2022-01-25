import java.util.Scanner;//for user input

public class EvenOdd {

    // user defined method we need to give inside this same class
    public static void findEvenOdd(int num) { // we need static to call it when in execution of the class
        // method body
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = scan.nextInt();
        findEvenOdd(num);

    }

}
