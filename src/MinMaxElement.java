public class MinMaxElement {

    public static void main(String[] args) {

        int arr[] = {12,32,453,54,34,54,32};

        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i]<min){

                min= arr[i];
            }

            if(arr[i]>max){
                max =arr[i];
            }
        }

        System.out.println("Smallest elment is "+min+ " and the Largest element is "+max);


    }
}
