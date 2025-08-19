public class MissingNumbeByBrouteForce {

    public static int FindMissingNumber(int[] arr, int N) {
        for (int i = 1; i <= N; i++) {
            // OUTER LOOP
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                // Inner loop to check if it's exist or not
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = { 1, 2, 4, 5 };
        int ans = FindMissingNumber(arr, N);
        System.out.println(ans);

    }
}
