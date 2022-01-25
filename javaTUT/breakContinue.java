public class breakContinue {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 2) {
                System.out.println("inside if before break");
                break;/*
                       * These two keywords help us control the loop from within it. break will cause
                       * the loop
                       * to stop and will go immediately to the next statement after the loop:
                       */
            }
            System.out.println(i);
        }
        System.out.println("next staement after loop\n");

        System.out.println("/////////////continue////////////\n");
        for (i = 0; i < 5; i++) {
            if (i <= 2) {
                System.out.println("inside if before continue ,current iteration " + i);
                continue;/*
                          * continue will stop the current iteration and will move to the next one.
                          * and therefore now rest lines are not executed just i in incremented and loop
                          * runs from start
                          */
            }
            System.out.println(i);
        }
        System.out.println("next staement after loop");
    }
}
