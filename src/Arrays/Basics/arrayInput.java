package Arrays.Basics;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        int[] arr = new int[5];
//        arr[0]= 23;
//        arr[1] = 40;
//        arr[2] = 10;
//        arr[3] = 15;
//        arr[4] = 20;


        for (int i = 0; i < arr.length; i++) {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }

//        System.out.println("   " +arr[3]);

//        for-each loop
        for (int num: arr) {
            System.out.print(num);
        }
//      toString METHOD OF THE ARRAYS CLASS
//        Arrays.toString(array name);


    }
}
