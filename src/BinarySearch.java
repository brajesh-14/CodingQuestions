public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        int start = 0;
        int end = arr.length - 1;
        int target = 30;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                System.out.println("Found at " + mid);
                return;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

    }
}
