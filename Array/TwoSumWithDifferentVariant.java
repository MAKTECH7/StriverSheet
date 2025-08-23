import java.util.Arrays;

public class TwoSumWithDifferentVariant {
    public static int[] TwoSum(int[] arr, int n, int target) {
        Arrays.sort(arr);
        // after sorting { 2, 5, 6, 8, 11 };
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                ans[0] = left;
                ans[1] = right;
                return ans;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int n = arr.length;
        int[] ans = TwoSum(arr, n, target);
        if(ans[0]== -1){
            System.out.println("No pair found");
        }else{
            
            System.out.println("the two indices will be " + arr[0] + "," + arr[1]);
        }

    }
}
