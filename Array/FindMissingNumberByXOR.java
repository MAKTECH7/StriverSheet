public class FindMissingNumberByXOR {
    public static int FindMissingNumber(int[] arr, int N) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < N - 1; i++) {
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);
        }
        xor2 = xor2 ^ N;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = { 1, 2, 4, 5 };
        int ans = FindMissingNumber(arr, N);
        System.out.println(ans);
    }
}
