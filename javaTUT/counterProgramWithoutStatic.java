public class counterProgramWithoutStatic {
    int count = 0;// will get memory each time when the instance is created
    static int count1 = 1;
    int a;

    counterProgramWithoutStatic() {
        count++;// incrementing value
        System.out.println("without static variable");
        System.out.println(count);
    }

    counterProgramWithoutStatic(int a) {
        this.a = a;
        count1++;// incrementing value
        System.out.println("with static variable");
        System.out.println(count);
    }

    public static void main(String[] args) {
        counterProgramWithoutStatic s1 = new counterProgramWithoutStatic();
        counterProgramWithoutStatic s2 = new counterProgramWithoutStatic();

        counterProgramWithoutStatic ss1 = new counterProgramWithoutStatic(1);
        counterProgramWithoutStatic ss2 = new counterProgramWithoutStatic(2);
    }

}
