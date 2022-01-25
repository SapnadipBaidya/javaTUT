public class switchStatement2 {
    public static void main(String[] args) {
        int i = 0;
        switch (i) {
            case 0:
                System.out.println("i is 0");
                // if break is not present ,its called fall thorugh it exewcutes all the switch
                // case statements
            case 1:
                System.out.println("i is 1");

            case 2:
                System.out.println("i is 2");

            default:
                for (int j = 0; j < 3; j++) {
                    System.out.println("greater than 2");
                }

                break;
        }
    }
}
