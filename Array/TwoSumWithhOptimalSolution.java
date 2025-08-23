import java.util.Arrays;

public class TwoSumWithhOptimalSolution {
    public static String TwoSum(int[] arr, int n, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "yes";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }

        return "NO";

    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int n = arr.length;
        String ans = TwoSum(arr, n, target);
        System.out.println(ans);
    }
}
