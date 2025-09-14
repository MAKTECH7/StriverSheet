import java.util.ArrayList;
import java.util.Collections;

public class LeadersByUsingExtraSpace {

    public static ArrayList<Integer> printLeader(int[] arr, int n) {
        ArrayList ans = new ArrayList<>();
        int maxi = arr[n - 1];
        ans.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxi) {
                maxi = arr[i];
                ans.add(arr[i]);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        int n = arr.length;

        ArrayList<Integer> ans = printLeader(arr, n);
        Collections.sort(ans, Collections.reverseOrder());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
