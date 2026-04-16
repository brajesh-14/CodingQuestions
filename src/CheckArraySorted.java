public class CheckArraySorted {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 32, 453, 54, 34, 54, 32};
        boolean isSorted = false;

        for(int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] >= arr[i + 1]) {
                isSorted = false;
                break;
            }

            isSorted = true;
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }
}
