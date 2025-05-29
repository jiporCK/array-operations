package array;

import java.util.Scanner;

public class ArrayTesting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // selection sort
        int[] arr = {9,5,3,7,3,1};

        for (int i = 0; i < arr.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        int low = 0;
        int high = arr.length - 1;
        int target = 7;
        int foundIndex = - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(7 + " found at index: " + foundIndex);

        scanner.close();

    }


}
