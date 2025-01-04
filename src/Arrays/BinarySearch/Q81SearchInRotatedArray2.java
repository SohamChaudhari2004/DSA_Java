package Arrays.BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class Q81SearchInRotatedArray2 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        System.out.println(search(nums,0));

    }

    static int binSearch(int[] nums, int target , int start ,int end){
        while(start <= end) {
            int mid = start + (end -start)/2 ;
            if (target > nums[mid]){
                start = mid+1;

            }
            else if (target < nums[mid]) {
                end= mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static boolean search(int[] nums, int target) {
        int pivot = pivot(nums);

        if(pivot == -1){
            return  binSearch(nums, target, 0, nums.length-1) == target;
        }

        if(nums[pivot]==target){
            return true;
        }

        if(nums[0] <= target){
            return   binSearch(nums, target , 0 , pivot-1)== target;
        }

        return binSearch(nums,target,pivot+1,nums.length-1) == target;

    }
    static  int pivot(int[]nums){
        int start = 0;
        int end = nums.length-1;
        while(start <=end) {
            int mid = start + (end - start) / 2;
            if(mid <end && nums[mid] >nums[mid+1] ){
                return mid;

        }
            if(mid > start && nums[mid] < nums[mid-1] ){
                return mid-1;
            }
            // if elements at middle ,start ans , end are equal the skip duplicates
            // start = start+ 1
            // end = end -1
            if(nums[mid] == nums[start] && nums[mid]== nums[end]){

//                check if start is pivot
                if(nums[start] > nums[start+1]){
                    return start ;
                }
                start = start + 1;
                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                end = end -1;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid]>nums[end]) ) {
                start = mid+1;
            }
            else {
                end = mid-1;

            }
        }
        return -1;
    }
}
