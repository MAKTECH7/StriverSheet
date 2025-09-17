public class LongestConsecutiveSequenceInArray {

    public static boolean LinearSearch(int[] arr, int num) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int LongestSequence(int[] arr, int n) {
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while (LinearSearch(arr, x + 1) == true) {
                x += 1;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;

    }

    public static void main(String[] args) {
        int[] arr = { 100, 200, 1, 3, 2, 4 };
        int n = arr.length;
        int ans = LongestSequence(arr, n);
        System.out.println("The longest Consecutive Sequence in Array is : " + ans);
    }
}
