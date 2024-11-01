public class Palindrome {
    public static void main(String[] args) {
        int N = 131;
        int ReverseNumber = 0;
        int dup = N;
        while (N > 0) {
            int ld = N % 10;
            ReverseNumber = ReverseNumber * 10 + ld;
            N /= 10;
        }
        if (dup == ReverseNumber) {
            System.out.println("Yes the " + dup + " number is palindrome Number");
        } else {
            System.out.println("The number is not palindrome");
        }
    }

}
