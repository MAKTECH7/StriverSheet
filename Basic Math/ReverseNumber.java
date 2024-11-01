public class ReverseNumber {
    public static void main(String[] args) {
        int N = 7789;
        int RevN = 0;
        while (N > 0) {
            int LastDigit = N % 10;
            RevN = ((RevN * 10) + LastDigit);
            N /= 10;
        }
        System.out.println(RevN);
    }

}
