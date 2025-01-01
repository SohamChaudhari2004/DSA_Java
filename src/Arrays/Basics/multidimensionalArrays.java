package Arrays.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalArrays {
    public static void main(String[] args) {
//        int[][] arr = new int[3][] => no of rows is to be specified compulsory
//                                      but col is not as different arrays can have different no of ele
//        syntax:
       /* int[3][] = {
                    {1,2,3},
                    {2},
                    {3,4,4}
                    }
            */


//        arr[m][n] => ele at m+1 row n+1 col    => +1 due to 0 based indexing


        //        input in a multidimensional array
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int row =0; row < arr.length ; row++){
//           loop for each col in every row
            for (int col =0 ; col<arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }
        }

//        for (int row =0; row < arr.length ; row++){
////           loop for each col in every row
//            for (int col =0 ; col<arr[row].length ; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        similar output

        for (int row =0; row < arr.length ; row++){            //  [1, 2, 3]  output
            System.out.println(Arrays.toString(arr[row]));     //  [4, 5, 6]
                                                               //  [7, 8, 9]

        }
    }
}

