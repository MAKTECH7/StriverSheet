public class MissingNumberByOptimal {
    public static int FindMissingNumber(int[] arr, int N) {
        int sum = N * (N + 1) / 2;
        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            s2 = s2 + arr[i];
        }
        return sum - s2;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = { 1, 2, 4, 5 };
        int ans = FindMissingNumber(arr, N);
        System.out.println(ans);
    }
}
