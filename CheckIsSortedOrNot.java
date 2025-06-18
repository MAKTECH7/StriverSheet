public class CheckIsSortedOrNot {

    static private boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 4, 5 };
        int n = arr.length;
        boolean sorted = isSorted(arr, n);
        System.out.println(sorted);
    }

}
