public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                // if (count > max) {
                // max = count; //this is manual logic when count is greater
                // only when max is update else it will remains same
                // }
                max = Math.max(max, count);// This if fro Math class in which max is updated when count value is larger
                                           // else it will not update
            } else {
                count = 0;
                // break;
            }
        }

        System.out.println(max);
    }
}
