public class RemoveDuplicateWithOptimizedCode {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5 };
        int j = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n - 1];
        System.out.println("Array after removing duplicates");
        for (int k = 0; k <= j; k++) {
            System.out.print(arr[i] + " ");
        }

    }

}
