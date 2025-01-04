package Arrays.Basics;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {2,34,65,5,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swaped( int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    // 2 pointer method => since start ptr and end ptr
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
            while(start < end){
                swaped(arr , start , end);
                start= start + 1;
                end = end-1;
            }
    }
}
