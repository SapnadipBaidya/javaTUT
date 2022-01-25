public class counterProgramWithWithoutStatic {
    int count = 0;// will get memory each time when the instance is created
    static int count1 = 1;
    int a;

    counterProgramWithWithoutStatic() {
        count++;// incrementing value
        System.out.println("without static variable");
        System.out.println(count);
    }

    counterProgramWithWithoutStatic(int a) {
        this.a = a;
        count1++;// incrementing value
        System.out.println("with static variable");
        System.out.println(count);
    }

    public static void main(String[] args) {
        counterProgramWithWithoutStatic s1 = new counterProgramWithWithoutStatic();
        counterProgramWithWithoutStatic s2 = new counterProgramWithWithoutStatic();

        counterProgramWithWithoutStatic ss1 = new counterProgramWithWithoutStatic(1);
        counterProgramWithWithoutStatic ss2 = new counterProgramWithWithoutStatic(2);
    }

}
