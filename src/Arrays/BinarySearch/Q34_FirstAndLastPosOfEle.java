package Arrays.BinarySearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Q34_FirstAndLastPosOfEle {
    public static void main(String[] args) {
    }
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};    //initial answer
             ans[0] = binsearch(nums , target , true);
            if(ans[0] != -1) {
                 ans[1] = binsearch(nums, target, false);
            }
            

            return ans;
        }

        static int binsearch(int[] nums , int target , boolean findStartIndex){
        int ans = -1;
            int start = 0;
            int end = nums.length -1;
            int mid;
            while(start<=end){
                mid = start + (end - start)/2;
                if(target < nums[mid]){
                    end  = mid -1;

                } else if (target > nums[mid]) {
                    start = mid+1;
                }
                else {
//                    potential ans is found look for more
                    ans = mid;
                    if(findStartIndex){
                        end = mid-1;
                    }else {
                    start = mid+1;}
                }
            }
            return ans;
        }
}
