package SortingAlgos.CycleSort;

import java.util.Arrays;

public class Q287findDuplicateNo {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp;
    }

    static int findDuplicate(int[] nums) {
        int i = 0 ;
        while( i <nums.length){
            if(nums[i] != i+1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                }
                else {
                    return nums[i];
                }
            }

            else {
                i++;
            }
        }
        return -1;
    }
}
