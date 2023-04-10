package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class primitaveArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int [4];
        // arr[0] = 34;
        // arr[1] = 334;
        // arr[2] = 354;
        // arr[3] = 341;
        // [34,334,354,341]
        // System.out.println(arr[2]);

        //input using for loops
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        // for(int num:arr){ // for every element in array, print the element
        //     System.out.print(num+" ");//here num represents element of the array 
        // }
    }   
}
