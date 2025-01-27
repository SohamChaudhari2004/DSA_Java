package SortingAlgos.CycleSort;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class Q2645SetMismatch {
    public static void main(String[] args) {
        int[] nums=  {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp;
    }
    static int[] append(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1]; // Create a new array with extra space
        System.arraycopy(arr, 0, newArr, 0, arr.length); // Copy elements to the new array
        newArr[arr.length] = element; // Add the new element
        return newArr;
    }
    static int[] findErrorNums(int[] nums) {
        int[] errNums = {};
        int i = 0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i ,correct);
            }
            else{
                i++;
            }
        }

        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j+1){
//                append(errNums, nums[j]);
                return new int[] {nums[j] , j+1};
            }
        }
        return errNums;
    }
}
