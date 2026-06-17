import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "wxyz";
        String str2 = "zyxw";

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a, b);

        System.out.println("String-1 : " + str1);
        System.out.println("String-2 : " + str2);
        System.out.println("Check if two given strings are anagrams or not?: " + result);
    }
}