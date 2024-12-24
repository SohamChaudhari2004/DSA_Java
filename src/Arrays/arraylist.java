package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        syntax   :
//        ArrayList<Integer> list = new ArrayList<>(initial capacity);

            ArrayList<Integer> list = new ArrayList<>(5);
//            list.add(67);
//            list.add(45);
//            list.add(54);
//            list.add(64);
//            list.add(104);
//            list.add(91);
//            list.add(38);
//        System.out.println(list.contains(91));
//        System.out.println(list);
//            list.set(2, 1000);
//        System.out.println(list);


        for (int i = 0; i<5 ; i++){
            list.add(in.nextInt());
        }


        for (int i = 0; i<5 ; i++){
            System.out.print(list.get(i) + "  ");
        }

    }
}
