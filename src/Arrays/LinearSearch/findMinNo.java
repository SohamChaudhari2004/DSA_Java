package Arrays.LinearSearch;

public class findMinNo {
    public static void main(String[] args) {
        int[] arr ={3,14,2,45,6,1};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int min = arr[0];  // say
        for (int i = 1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }




}
