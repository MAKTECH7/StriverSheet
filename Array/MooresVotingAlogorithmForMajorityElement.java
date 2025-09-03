public class MooresVotingAlogorithmForMajorityElement {
    public static int FindMajorityElement(int[] arr, int n) {
        int count = 0;
        int element = 0;
        // for applying algorithm
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        // Check if the stored element is majority element
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        if (count > n / 2) {
            return element;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 1, 2, 2 };
        int n = arr.length;
        int ans = FindMajorityElement(arr, n);
        System.out.println("the majority element will be: " + ans + " by moore's voting algorithm");
    }
}
