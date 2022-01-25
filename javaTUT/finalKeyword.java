import java.util.Scanner;

public class finalKeyword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final float pi = 3.14f;
        System.out.println("Enter radius");
        double radius = scan.nextDouble();
        System.out.println("Area is " + (radius * radius * pi));
        System.out.println(pi + " " + radius);

    }
}
