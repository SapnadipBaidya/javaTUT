public class operatorExample {
    public static void main(String[] args) {
        int x = 10;
        int a = 10;
        int b = 10;
        System.out.println(x++);// 10 -> 11 //print->assign =10
        System.out.println(++x);// 12 //assign->print = 12
        System.out.println(x--);// 12 -> 11 //print->assign = 12
        System.out.println(--x);// 10 //assign->print = 10
        System.out.println(a++ + ++a); // 10->11[print->assign] + 12 [assign->print] =22
        System.out.println(b++ + b++); // 10->11[print->assign] + 11->12[print->assign] =21

        int c = 10; // 0 1 2 3 4 5 6 7 8 9 10
        // // ~c// (-) 1 2 3 4 5 6 7 8 9 10 11
        int d = -10;
        boolean f = true;
        boolean g = false;
        System.out.println(~c);// -11 therefore 10 becomes -11
        System.out.println(~d);// 9
        System.out.println(!f);
        System.out.println(!g);
    }
}
