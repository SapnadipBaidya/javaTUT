public class usingThisParameterAsMethodParameter {
    public int a;
    public int b;

    public String myName() {
        String s = "Sapnadip Baidya";
        return s;
    }

    usingThisParameterAsMethodParameter() {
        a = 10;
        b = 20;
        myName();
    }

    public void display(usingThisParameterAsMethodParameter object) {
        System.out.println(a + " " + b + " " + myName());
    }

    public void get() {
        display(this);
    }

    public static void main(String[] args) {
        usingThisParameterAsMethodParameter ob1 = new usingThisParameterAsMethodParameter();
        ob1.get();
    }
}
