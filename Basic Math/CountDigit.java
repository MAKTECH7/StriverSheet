import java.util.*;

public class CountDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        while (N > 0) {
            // int LastDigit = N % 10;
            cnt = cnt + 1;
            N = N / 10;
        }
        System.out.println(cnt);

    }
}
