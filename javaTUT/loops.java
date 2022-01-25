public class loops {
    public static void main(String[] args) {
        short a = 1;
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("//////////    for   /////////////////\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.print("//////////    while         /////////////////\n");
        while (a < 4) {

            System.out.println(a);
            a++;
        }
        System.out.print("////////////    dowhile      ///////////////\n");
        do {

            System.out.println(a);// since this executes even before the while condition

        } while (a < 4);
        System.out.print("//////// foreach  ////////////////////////\n");
        int[] arr1 = { 5, 4, 3, 2, 1, 0 };
        for (int ei : arr1) {
            System.out.println(ei);
        }
    }
}
