package Arrays.BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Q852PeakEleMountainArray {

    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
    }

    static int peakIndexInMountainArray(int[] arr) {

        int start =0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid; //ele in dec part of array look at left,

            } else   {
                start = mid +1;//ele in asc part of array look at right
                //as we know mid+1 ele greater than arr[mid]

            }

        }

//            in the end, start == end and pointing to the largest number because of the 2
//            start and end are always trying to find max element in the above 2 checks
//            hence, when they are pointing to just one element, that is the max ele
//            at every iteration there is a best ans for peak index , so when there is only one ele left, it has to be the
//            peak index according to the conditions

        return start;

    }

}
