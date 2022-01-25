import java.util.Scanner;

public class Addition {
    static void sum(float a, float b) {
        System.out.println(a + b);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b;

        System.out.println("enter the value of a : ");
        a = scan.nextFloat();
        System.out.println("\n");
        System.out.println("enter the value of b : ");
        b = scan.nextFloat();
        sum(a, b);
    }
}
