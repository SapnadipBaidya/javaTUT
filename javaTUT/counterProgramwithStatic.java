public class counterProgramwithStatic {
    static int count = 0;// will get memory only once and retain its value

    int a;

    counterProgramwithStatic() {
        count++;// incrementing value
        System.out.println("without static variable");
        System.out.println(count);
    }

    public static void main(String[] args) {

        counterProgramwithStatic ss1 = new counterProgramwithStatic();
        counterProgramwithStatic ss2 = new counterProgramwithStatic();
    }

}
