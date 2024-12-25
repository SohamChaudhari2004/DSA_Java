package Arrays.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// use divide and conquer to check if the array is sorted and then do the median calculation using binary search
// https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class Q4MedianOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {5,6,7,8};

        System.out.println(findMedianSortedArrays(nums1,nums2));


    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];

//        copy ele of nums1 1
        for(int i =0; i<nums1.length;i++ ){
            mergedArray[i] = nums1[i];
        }

//        copy ele of nums2
        for(int i =0; i<nums2.length;i++ ){
            mergedArray[nums1.length + i] = nums2[i];
        }
        System.out.println(Arrays.toString(mergedArray));

        int start = 0;
        int end = mergedArray.length-1;
        int mid  = start +(end-start)/2;
        double ans=0;
        while(start< end){
            if(end % 2 == 0){
                ans = mergedArray[mid];
            }
            else {
               ans = (mergedArray[mid] + mergedArray[mid + 1])/2.0 ;
//                System.out.println(ans);
            }
            break;
        }

        return ans;
    }
}
