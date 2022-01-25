import java.util.Scanner;

public class percentage {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Subjects");
        double n = sc.nextDouble();
        System.out.println("Enter Total Number in a subject");
        double max = sc.nextDouble();
        max = max * n;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter The Number in Subject " + (i + 1));
            double number = sc.nextDouble();
            sum = sum + number;
        }
        System.out.println(sum);
        System.out.println(max);
        double p = ((sum / max) * 100);
        System.out.println("Total Percentage " + p + "%");

    }

}