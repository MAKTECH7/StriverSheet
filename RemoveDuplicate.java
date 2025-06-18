import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4 };
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("After remove the elements");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}