public class SecondSmallAndSecondLarge {

    static private int secondSmallest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) { // 1<7
                second_small = small; // 7 =7
                small = arr[i]; // 1
            } else if (arr[i] < second_small && arr[i] > small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }

    static private int secondLargest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int Large = Integer.MIN_VALUE; // { 1, 2, 3, 4, 7, 7, 5 };
        int second_Large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > Large) {
                second_Large = Large;
                Large = arr[i];
            } else if (arr[i] > second_Large && arr[i] < Large) {
                second_Large = arr[i];
            }
        }
        return second_Large;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 7, 5 };
        int n = arr.length;
        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);
        System.out.println("second Smallest is " + sS);
        System.out.println("second Largest is " + sL);
    }

}
