package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] nums = {5,4,3,2,1};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void BubbleSort(int[] arr){
            int swap = 0;
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length - i; j++) {
    //                swap if the current ele is smaller than the prev ele
                    if(arr[j]< arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1]  = temp;
                        swap = swap +1 ;
                    }
                }
    //            when there are no swaps break the loop
                if (swap == 0){
                    break;
                }

            }
                    System.out.println("No of swaps : " + swap);
    }
}
