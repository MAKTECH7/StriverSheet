public class MajorityElement {

    public static int FindMajorityElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
                if (count > n / 2) {
                    return arr[i];
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 1, 2, 2 };
        int n = arr.length;
        int ans = FindMajorityElement(arr, n);
        System.out.println("the majority element will be: " + ans);

    }
}
