public class ReverseAString {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "I love you";
        String bye = reverseWords(s);
        System.out.println(bye);
    }
}
