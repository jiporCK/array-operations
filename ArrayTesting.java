package array;

import java.util.Scanner;

public class ArrayTesting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[2000];
        int size = arr.length;
        int i = 0;
        while (size > 0) {
            arr[i] = ++i;
            --size;
        }

        // 1,2,3,....,2000
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);

        int low = 0;
        int high = arr.length - 1;
        int value = 300;
        int foundIndex = -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] == value) {
                foundIndex = mid;
                break;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.printf("Element [%d] found at index: [%d]", value, foundIndex);

        scanner.close();

    }

}
