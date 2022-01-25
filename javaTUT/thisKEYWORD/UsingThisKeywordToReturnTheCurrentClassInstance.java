public class UsingThisKeywordToReturnTheCurrentClassInstance {
    public int a;
    public int b;

    public String myName() {
        String s = "Sapnadip";
        return s;
    }

    UsingThisKeywordToReturnTheCurrentClassInstance() {
        a = 5;
        b = 7;
    }

    UsingThisKeywordToReturnTheCurrentClassInstance get() {
        return this;
    }

    void display() {
        System.out.println("a = " + a + "  b = " + b + "  " + myName());
    }

    public static void main(String[] args) {
        UsingThisKeywordToReturnTheCurrentClassInstance obj = new UsingThisKeywordToReturnTheCurrentClassInstance();
        obj.get().display();
    }
}
