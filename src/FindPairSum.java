public class FindPairSum {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15, 4, 7, 5, 8, 1};
        int target = 9;

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr.length; ++j) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The sum pair are " + arr[i] + " and " + arr[j]);
                }
            }
        }

    }
}
