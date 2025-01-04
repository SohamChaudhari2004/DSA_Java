package SortingAlgos.CycleSort;

import java.util.Arrays;

public class Q268MissingNO {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int ans = missingNumber(nums);
        System.out.println(ans);

    }
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp;
    }
    static int missingNumber(int[] nums) {
       int i = 0;

       int missing = 0;
       while(i < nums.length){
           int correct = nums[i];
           if(nums[i] < nums.length && nums[i] != nums[correct]){
               swap(nums,i,correct);
           }
           else i++;
       }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
        }
       return nums.length;
    }
}
