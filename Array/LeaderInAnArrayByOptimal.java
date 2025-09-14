// import java.util.ArrayList;

public class LeaderInAnArrayByOptimal {

    public static int[] printLeader(int[] arr, int n) {
        int[] leader = new int[n];
        int max = arr[n - 1];
        int index = 0;
        leader[index++] = max;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leader[index++] = max;
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = leader[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        int n = arr.length;

        int[] ans = printLeader(arr, n);
        for (int i = ans.length - 1; i >= 0; i--) {
            System.out.print(ans[i] + " ");
        }

    }
}
