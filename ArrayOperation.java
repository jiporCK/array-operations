package array;

import java.util.Arrays;

public class ArrayOperation {

    public static void main(String[] args) {

        // Basic Array Operations
        int[] arr = {10, 24, 9, 2, 5, 4, 2, 18};
        for (int a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        // Insert element to a specific position
        int elementToInsert = 1;
        int positionToInsert = 2;
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j= 0; i < newArr.length; ++i) {
            if (i == positionToInsert) {
                newArr[i] = elementToInsert;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        arr = newArr; // assign new array to the original array
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Delete element from array
        int elementToDelete = 2;
        // to count element that is not equal to 2
        int count = 0;
        for (int num : arr) {
            if (num != elementToDelete) {
                count++;
            }
        }
        System.out.println(count);
        int[] arrAfterDelete = new int[count];
        for (int i = 0, j= 0; i < arr.length; i++) {
            if (arr[i] != elementToDelete) {
                arrAfterDelete[j] = arr[i];
                j++;
            }
        }
        arr = arrAfterDelete;
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // bubble sort
//        for (int i = 0; i < arr.length - 1; ++i) {
//            for (int j = 0; j < arr.length - 1 - i; ++j) {
//                if (arr[j] > arr[j+1]) {
//                    // swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for (int num: arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // find index of smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // reverse sorted array
        // two-pointers
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
            --end;
        }
        for (int num: arr) {
            System.out.print(num + " ");
        }


    }



}
