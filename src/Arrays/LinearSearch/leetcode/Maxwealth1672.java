package Arrays.LinearSearch.leetcode;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class Maxwealth1672 {
    public static void main(String[] args) {

    }
    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {

                sum += anInt;

            }
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;
    }
    
}
