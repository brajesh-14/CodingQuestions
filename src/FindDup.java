public class FindDup {

    public static void main(String[] args) {

        int arr[] = {12,32,453,54,34,54,32};

        for(int i = 0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
            }
            }
        }
    }
}
