public class FirstUniqueCharacter {
    public static void main(String[] args) {

        String str = "wresource";
        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                index = i;
                break;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);
    }
}