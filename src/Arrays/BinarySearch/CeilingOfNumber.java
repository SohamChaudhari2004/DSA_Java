package Arrays.BinarySearch;
// floor of a number is similar just return end instead of -1 in the end
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums , 4 ));
    }
    static int search(int[] nums, int target) {
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
                 return mid;
             }
         }
         return start;

    }
}
