import java.util.Scanner;

public class rectanglePerimeter {
    public static void main(String[] args) {
        float a, b, c, d;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number : ");
        a = scan.nextFloat();
        b = a;
        System.out.println("enter the number : ");
        c = scan.nextFloat();
        d = c;
        System.out.println("perimeter is : " + (2 * a + 2 * c));
        System.out.println("area is : " + (a * c));

    }
}
