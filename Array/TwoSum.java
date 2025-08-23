public class TwoSum {

    public static int[] TwoSum(int[] arr, int n, int target) {
        int i = 0;
        int j = 0;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;

                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int n = arr.length;
        int[] ans = TwoSum(arr, n, target);
        System.out.println("The two indices will be " + ans[0] + "," + ans[1]);
    }
}
