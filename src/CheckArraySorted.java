public class CheckArraySorted {

    public static void main(String[] args) {

        int arr[] = {12,32,453,54,34,54,32};

        boolean isSorted= false;
        for(int i=0; i< arr.length-1; i++){

            if(arr[i]<arr[i+1]){
                isSorted=true;
            }else{
                isSorted=false;
                break;
            }
        }
        if(isSorted==true){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
