package Arrays;

import java.util.Arrays;

public class MaxEle {
    public static void main(String[] args) {
        int[] arr  = {1,3,5,45,19,2};

        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int i;
        int maxVal = arr[0];
        for ( i=1;i<arr.length ; i++){
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }






}
