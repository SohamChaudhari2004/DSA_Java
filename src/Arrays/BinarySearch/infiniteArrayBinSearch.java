package Arrays.BinarySearch;

public class infiniteArrayBinSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
int target = 100;
        System.out.println(findRange(arr,target));
    }

    static int findRange(int[] arr, int target){
        //starting with box of size 2
        int start=0;
        int end= 0;

        while(target > arr[end]){
            int newstart = end+1; //like temp to update start without actually updating it => holding ref for later use
            //end = prevEnd + sizeOfBox*2   //sizeOfBox = end-start+1
            end= end + (end - start + 1 )*2; //double box val
            start = newstart; //updating start after updating end like temp
        }
        return search(arr , target, start,end);

    }
    static int search(int[] nums, int target , int start ,int end) {
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

}
