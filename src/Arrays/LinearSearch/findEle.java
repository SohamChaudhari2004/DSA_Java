package Arrays.LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class findEle {
//    public static void main(String[] args) {
//        int[] arr ={2,3,14,45,6};
//
//        linearSearch(arr);
//    }
//
//    static void linearSearch(int[] arr ){
//        Scanner in = new Scanner(System.in);
//        boolean found;
//        int ele = in.nextInt();
//        for(int i = 0 ; i< arr.length; i++){
//            if(arr[i] == ele){
//                System.out.println("ele found at index "+ i);
//
//
//
//            }
//        }
//
//

    public static void main(String[] args) {
        int[][] arr =  {
                {2,23,42,16},
                {4,14,20},
                {42,36 ,3,1}
        };
        int target = 14;
        System.out.println(Arrays.toString(search(arr , target)) );
    }
    static int[] search (int[][] arr , int target){
        for (int row =0; row < arr.length ; row++){
//           loop for each col in every row
            for (int col =0 ; col<arr[row].length ; col++){
                if(target == arr[row][col]);
                return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
    }





