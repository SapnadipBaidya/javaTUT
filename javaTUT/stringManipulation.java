public class stringManipulation {
    public static void main(String[] args) {
        String address = "kolkata west bengal India";
        if (address.endsWith("India")) {
            if (address.contains("west bengal")) {
                System.out.println("your state is " + address.split(" ")[1] + " " + address.split(" ")[2]);
            } else {
                System.out.println("not in West bengal");
            }
        } else {
            System.out.println("not in india");
        }
    }
}
