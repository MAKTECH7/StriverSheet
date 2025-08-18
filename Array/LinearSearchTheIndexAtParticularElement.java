public class LinearSearchTheIndexAtParticularElement {

    public static int LinearSearch(int n, int[] arr, int nums) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == nums) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 4, 1, 3 };
        int n = arr.length;
        int nums = 7;
        int result = LinearSearch(n, arr, nums);
        System.out.println("The element found at index " + result);
    }
}
