import java.util.HashSet;

public class LongestConsecutiveSequenceInArrayByOptimal {

    public static int LongestSequence(int[] arr, int n) {
        if (n == 0)
            return 0;
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int it : set) {
            if (!set.contains(it - 1)) {
                int x = it;
                int count = 1;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }
                longest = Math.max(longest, count);
            }
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
