public class array {
    public class Main {
        public static void main(String[] args) {
            int[] numbers = { 1, 2, 3 };
            int length = numbers[2];// 3
            char[] chars = new char[length];
            chars[numbers.length - 1] = 'y';// chars[3-1] or chars[2]='y'
            System.out.println("Done!");
        }
    }
}
