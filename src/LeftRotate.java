import java.util.Arrays;

public class LeftRotate {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 32, 453, 54, 34, 54, 32};
        int start = arr[0];
        int idx = 0;

        for(int i = 0; i < arr.length - 1; ++i) {
            arr[idx] = arr[i + 1];
            ++idx;
        }

        arr[idx] = start;
        System.out.println(Arrays.toString(arr));
    }
}
