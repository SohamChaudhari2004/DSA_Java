package SortingAlgos.CycleSort;

import java.lang.classfile.Interfaces;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 class Q448AllMissingNos {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while(i< nums.length){
            int correctIdx = nums[i] -1;
            if(nums[i] != nums[correctIdx]){
                swap(nums , i , correctIdx);
            }
            else i++;
        }
//        just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index< nums.length;index++){
            if(nums[index] != index+1){
                
            }

        }
    }


     void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp;
    }

     void cycleSort(int[] nums){
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
