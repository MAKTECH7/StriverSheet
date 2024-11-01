public class Digit {

    public static int Digits(int N) {
        int count = 0;
        while (N > 0) {
            count = count + 1;
            N /= 10;

        }

        return count;
    }

    public static void main(String[] args) {
        int N = 123456;
        int number = Digits(N);
        System.out.println("the number is  " + N + " and the digits is " + number);
    }

}
