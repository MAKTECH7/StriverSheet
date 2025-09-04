public class BuyOrSellStockAsPerProfit {

    public static int maxProfit(int[] arr, int n) {
        int maxPro = 0;
        int minimumPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            minimumPrice = Math.min(minimumPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minimumPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int n = arr.length;
        int maxPro = maxProfit(arr, n);
        System.out.println("Max profit is: " + maxPro);
    }
}
