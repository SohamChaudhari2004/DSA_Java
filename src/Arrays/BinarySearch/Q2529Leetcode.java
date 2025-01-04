package Arrays.BinarySearch;

public class Q2529Leetcode {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maxCount(nums));

    }
    static int max(int a , int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }

    static int maxCount(int[] nums){
        int pos = 0;
        int neg = 0;

        for(int i=0 ; i<=nums.length-1;i++){
            if(nums[i]>0){
                pos++;
            }
            if(nums[i]<0){
                neg++;
            }
        }

        return max(pos,neg);
    }

//    public int maximumCount(int[] nums) {
//        int max =0;
//        int s = 0;
//        int e = nums.length-1;
//        int mid = s + (e-s)/2;
//        int lastneg ;
//        int firstpos;
//        int npos=0;
//        int nneg=0;
//
//        while (nums[mid]<0 && mid <e){
//            lastneg = mid;
//            mid = mid+1;
//            nneg = lastneg+1;
//
//        }
//
//
//        if (nums[mid]>= 0 && mid > s){
//            firstpos = mid;
//            mid = mid-1;
//            npos = e-firstpos +1;
//            nneg = e-npos+1;
//        }
//
//
//        if(npos == e){
//            npos++;
//            nneg=0;
//        }
//        if(nneg==e) {
//            nneg++;
//            npos=0;
//        }
//
//
//        System.out.println("npos " + npos);
//        System.out.println("nneg " + nneg);
//
//
//
//        return max(npos,nneg);
//    }

}
