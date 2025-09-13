public class RearrangethePosNegByOptimal {
    public static int[] RearrangeThePosNeg(int[] arr, int n) {
        int[] ans = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans[negIndex] = arr[i];
                negIndex += 2;
            } else {
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5 };
        int n = arr.length;
        int[] ans = RearrangeThePosNeg(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
