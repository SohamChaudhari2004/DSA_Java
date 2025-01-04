package Arrays.BinarySearch;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//Array is sorted and rotated
public class Q153FindMinEleRotatedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(minimum(nums));
    }

    static int minimum(int[] nums){
        int start = 0;
        
        if(pivot(nums) ==-1){
            return nums[start];
        }
        else {
            return nums[pivot(nums)+1];
        }


    }
    static int pivot(int[] nums  ){
        int start = 0;
        int end  = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
//            4 cases
            if(mid<end && nums[mid] >nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid]<nums[mid-1]) {
                return  mid-1;
            }
            if (nums[start] >= nums[mid]) {
                end = mid-1;

            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }
}
