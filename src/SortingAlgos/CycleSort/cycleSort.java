package SortingAlgos.CycleSort;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp;
    }

    static void cycleSort(int[] nums){
        int i =0;
        while(i< nums.length){
            int correctIdx = nums[i] -1;
            if(nums[i] != nums[correctIdx]){
                swap(nums , i , correctIdx);
            }
            else i++;
        }
    }
}
