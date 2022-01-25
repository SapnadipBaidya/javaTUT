public class switchStatement {
    public static void main(String[] args) {
        String address = "kolkata west bengal India";

        String city = address.split(" ")[0];

        switch (city) {
            case "kolkata":
                System.out.println("its the city of joy!");
                break;
            case "bangalore":
                System.out.println("its the city of tech!");
                break;
            default:
                System.out.println("no city");
                break;
        }

    }
}
