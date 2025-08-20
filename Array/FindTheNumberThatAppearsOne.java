public class FindTheNumberThatAppearsOne {

    public static int FindTheNumberThatAppearsOnes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) { 
                    count++;  //count will be two as much this condition true
                }
            }
            if (count == 1) {

                return num; //found the unique number
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
        int ans = FindTheNumberThatAppearsOnes(arr);
        System.out.println(ans);

    }
}
