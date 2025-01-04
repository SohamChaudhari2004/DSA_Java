package Java_Basics;

import java.util.Scanner;

public class armstrongNo {
//print  the three digit armstrong numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrongNo(n));
    }

    static boolean isArmstrongNo(int a){
        int sum =0;
        int original = a;
        while(a >=1){
               int rem = a%10;
            System.out.println(rem);
               int cube = rem*rem*rem;
                 sum += cube;
                a=a/10;

        }
        return sum == original;
    }
}
