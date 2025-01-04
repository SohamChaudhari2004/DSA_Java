package SortingAlgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int max = getMax(nums, 0, last);
            swap(nums , max,last);
        }
    }

    static void swap(int[] nums, int first , int second){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp;
    }

    static int getMax(int[] nums , int start , int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(nums[max]< nums[i]){
                max = i;

            }
        }
        return max;
    }
}
