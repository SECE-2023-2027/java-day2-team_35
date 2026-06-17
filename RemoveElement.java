import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 6, 2};
        int value = 6;

        int newLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                arr[newLength] = arr[i];
                newLength++;
            }
        }

        System.out.println("Original array: [1, 4, 6, 7, 6, 2]");
        System.out.println("The length of the new array is: " + newLength);

        System.out.print("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}