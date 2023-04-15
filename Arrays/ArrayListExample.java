package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(34);
        // list.add(347);
        // list.add(345);
        // list.add(341);
        // list.add(346);
        // list.add(324);
        // list.add(345);

        // System.out.println(list);

        // INPUT
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here, list[index] syntax will here
        }

        System.out.println(list);

    }
}
