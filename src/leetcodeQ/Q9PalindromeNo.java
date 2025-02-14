package leetcodeQ;

public class Q9PalindromeNo {
    public static void main(String[] args) {
        int x= 1001;
        boolean ans =isPalindrome(x);

    }
    static boolean isPalindrome(int x){
        boolean ans = true;
        int cutNo = x;
        int newNo = 0;
        int i = 0;
        if(x < 0){
            return false;
        }
        while(cutNo%10 >= 0 && cutNo > 0 ){
            int rem = cutNo % 10;
            cutNo= cutNo /10;
            newNo = newNo*10 + rem;
            i++;
        }
        if(newNo == x){
            ans = true;
        }
        else{
            ans = false;
        }
        return ans;

    }

}
