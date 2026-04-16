import java.util.Arrays;

public class RemoveDup {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 32, 453, 54, 34, 12, 453, 54, 32};
        int[] unique = new int[arr.length];
        int index = 0;

        for(int k : arr) {
            boolean isDup = false;

            for(int j = 0; j < index; ++j) {
                if (k == arr[j]) {
                    isDup = true;
                    break;
                }
            }

            if (!isDup) {
                unique[index++] = k;
            }
        }

        System.out.println("After removing the duplicate element " + Arrays.toString(unique));
    }
}
