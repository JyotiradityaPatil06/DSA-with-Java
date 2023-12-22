package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 4, 5 };
        System.out.println(find(arr, 2, 0));
        System.out.println(findInd(arr, 2, 0));
        System.out.println(findIndLast(arr, 2, arr.length - 1));
        findAll(arr, 4, 0);
        System.out.println(list);
    }

    // return boolean
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    // find index from start
    static int findInd(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findInd(arr, target, index + 1);
        }
    }

    // find index from last
    static int findIndLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findInd(arr, target, index - 1);
        }
    }

    // array list
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAll(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        findAll(arr, target, index + 1);
    }

    // returing the array list
    static ArrayList<Integer> findAllInd(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        findAllInd(arr, target, index + 1, list);
    }

}
