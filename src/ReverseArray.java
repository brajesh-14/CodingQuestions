public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 32, 453, 54, 34, 54, 32};
        int len = arr.length;
        int[] revArray = new int[len];

        for(int i = 0; i < len; ++i) {
            revArray[len - 1 - i] = arr[i];
        }

        for(int i = 0; i < revArray.length; ++i) {
            System.out.print(revArray[i] + " ");
        }

    }

}
