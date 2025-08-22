public class Subarray {
    public static int getLongestSubarray(int[] arr, long k) {
        int n = arr.length;
        int len = 0;   
        for (int i = 0; i < n; i++) { // starting of index 
            long sum = 0;
            for (int j = i; j < n; j++) { // ending of index
                sum += arr[j]; 
                if (sum == k) {
                    len = Math.max(j - i + 1, len); // while sum equals to k calculate the len
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 20, 3, 10, 5 };
        long k = 33;
        int len = getLongestSubarray(arr, k);
        System.out.println("The Longest Subarray is : " + len);
    }
}
