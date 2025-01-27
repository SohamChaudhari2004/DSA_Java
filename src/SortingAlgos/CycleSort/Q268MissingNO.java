package SortingAlgos.CycleSort;

import java.util.Arrays;

public class Q268MissingNO {
    public static void main(String[] args) {
        int[] nums = {0,1,3};
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
           else {
               i++;
           }
       }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
        }
       return nums.length;
    }


    /**
     * get the length of array range [1,n]
     * calc the sum of all the elements in range n*(n+1)/2 => TotalSum
     * get the actual sum of elements in the array(sum)
     * subt totalSum - sum
     */
    static int missingNoUsingTsum(int[] nums){
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i=0; i<=n ; i++){
            sum+=nums[i];
        }
        return totalSum-sum;
    }
}
