public class copyCons {
    int id;
    String name;

    copyCons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    copyCons(copyCons s) {
        this.id = s.id;
        this.name = s.name;
    }

    copyCons() {
    }

    void display() {
        System.out.println(this.id + " " + this.name);
    }

    public static void main(String[] args) {
        copyCons s1 = new copyCons(111, "Sapnadip Baidya");
        copyCons s2 = new copyCons(s1);
        copyCons s3 = new copyCons();
        s1.display();
        s2.display();
        s3.id = s2.id;
        s3.name = s2.name;
        s3.display();
    }
}