package leetcodeQ;

public class Q217ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }

    static boolean containsDuplicate(int[] nums) {
        boolean ans = false;

        for(int i = 0; i<nums.length; i++){
            for(int j = 1; j<nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    ans = true;

                }
                else{
                    ans = false;
                }

            }
        }

        return ans;
    }
}
