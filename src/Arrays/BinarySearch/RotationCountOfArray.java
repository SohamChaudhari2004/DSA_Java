package Arrays.BinarySearch;
// find the number of times the sorted array is rotated
// works for multiple duplicate values
public class RotationCountOfArray {

    public static void main(String[] args) {
        int[] nums = {2,4,5,6,7,0,1,2};
        System.out.println(RotationCount(nums));
    }

    static int RotationCount(int[] nums){
        int start = 0;
        int end= nums.length-1;
        int pivot = 0;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(mid < end && nums[mid]> nums[mid+1]){
                pivot =  mid;
            }
            if(mid > start && nums[mid]< nums[mid-1] ){
                pivot=  mid-1;
            }
            if(nums[mid] < nums[start]){
                end= mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return pivot +1;
    }
}
