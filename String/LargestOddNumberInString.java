public class LargestOddNumberInString {

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 != 0) {
                String result = num.substring(0, i + 1);
                result = result.replaceFirst("^0+", "");
                return result;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String num = "0245638";
        String s1 = largestOddNumber(num);
        System.out.println(s1);
    }
}
