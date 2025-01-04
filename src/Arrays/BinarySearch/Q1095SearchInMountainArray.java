package Arrays.BinarySearch;

public class Q1095SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(search(arr,3));
    }

    static int search(int[] arr ,int target){
        int peak = peakIndexInMountainArray(arr);
        int first = orderBs(arr,target , 0,peak);
        if(first != -1){
            return first;
        }
        else{
            return orderBs(arr,target , peak+1, arr.length-1);
        }
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

    static int orderBs(int[] arr , int target,int start, int end){


        boolean isAsc = arr[start] <arr[end];

        while(start <= end){
            int mid = start +(end-start)/2;

            if(arr[mid]== target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] > target){
                    end = mid-1;

                }else{
                    start  = mid+1;

                }
            }else {
                if(arr[mid] > target){
                    start = mid+1;

                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
