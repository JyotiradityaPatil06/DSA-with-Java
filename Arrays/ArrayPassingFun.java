package Arrays;

import java.util.Arrays;

public class ArrayPassingFun {
    public static void main(String[] args) {
        int[] num = {34,13,67,12,1};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change (int[] arr){
        arr[0] = 99; //mututal_behaviour
    }
}
