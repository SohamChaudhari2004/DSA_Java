package Arrays.BinarySearch2D;

import javax.naming.directory.SearchControls;
import java.util.Arrays;

public class intro2DBinSearch {

    public static void main(String[] args) {
    int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
    };
        System.out.println(Arrays.toString(Search(arr,37)));


    int[][] sortedArr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
    };
        System.out.println(Arrays.toString(SortedSearch(sortedArr , 9)));
//        not complete
    }
//  Array is sorted in a row and col manner
    static int[] Search(int[][] matrix , int target){
        int r= 0;
        int c = matrix.length-1;

        while (r< matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }  if (matrix[r][c] < target) {
                r++;
            }
            else {
                c--;
            }
            }
        return new int[]{-1,-1};

        }
//  Search in the row provided and the columns provided
    static int[] binarySearch(int[][] matrix, int row , int colstart , int colend , int target){
        while(colstart <= colend){
            int mid = colstart + (colend - colstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                colstart = mid + 1;
            }
            else {
                colend = mid-1;
            }
        }

        return new int[]{-1,-1};
    }
//    2d Array is completely sorted
    static int[] SortedSearch(int[][] matrix , int target){
        int rows = matrix.length;
        int col = matrix[0].length;
        int rStart = 0;
        int rEnd = rows-1;
        int colMid = col/2;
        if(rows == 1){
          return binarySearch(matrix , 0 , 0 , col -1,target);

        }
        while (rStart < (rEnd -1)){
//            matrix will have more than two rows
            int mid = rStart + (rEnd -rStart)/2;
            if(matrix[mid][colMid] == target){
                return new int[]{mid,colMid};

            }if(matrix[mid][colMid] < target){
                rStart = mid;

            }
            else {
                rEnd = mid;
            }


        }
//        now we have two rows left
//        check if the target is the col of two rows
        if(matrix[rStart][colMid] == target){
            return  new int[]{rStart,colMid};
        }if(matrix[rStart+1][colMid] == target){
            return  new int[]{rStart+1,colMid};
        }

//        search in 1st half
        if (target <= matrix[rStart][colMid-1]){
            binarySearch(matrix, rStart , 0 , colMid-1, target);
        }
//        search in 2nd half
        if (target <= matrix[rStart][colMid+1] && target <= matrix[rStart][col- 1]){
            binarySearch(matrix, rStart ,  colMid+1 , col-1, target);

        }
//        search in 3rd half
        if (target <= matrix[rStart+1][colMid-1]){
            binarySearch(matrix, rStart+1 , 0 , colMid-1, target);

        }
//        search in 4th half
        else{
            binarySearch(matrix, rStart+1 , colMid+1 , colMid-1, target);

        }

        return new int[]{-1,-1};
    }



}





