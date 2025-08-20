public class FindTheNumberThatAppearsOnesByOptimal {
    public static int FindTheNumberThatAppearsOnes(int[] arr) {
        // int num = 0;
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
        int ans = FindTheNumberThatAppearsOnes(arr);
        System.out.println(ans);

    }
}
