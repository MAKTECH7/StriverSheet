public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int dup = num;
        int sum = 0;
        while (num > 0) {
            int ld = num % 10;
            num /= 10;
            sum = sum + (ld * ld * ld);
        }
        System.out.println(sum);
        if (dup == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("number is not armstrong");
        }
    }

}
