package array;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {9,5,3,7,3,1};

        int pos = 2;
        int element = 8;
        int[] newNums = new int[nums.length + 1];
        for (int i = 0, j = 0; i < newNums.length; ++i) {
            if (i == pos) {
                newNums[i] = element;
            } else {
                newNums[i] = nums[j];
                ++j;
            }
        }
        nums = newNums;

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        int elementToDelete = 3;
        int count = 0;
        for (int i : nums) {
            if (i != elementToDelete) {
                ++count;
            }
        }
        int[] newArr = new int[count];
        for (int i = 0, j= 0; i < nums.length; ++i) {
            if (nums[i] != elementToDelete) {
                newArr[j] = nums[i];
                ++j;
            }
        }
        nums = newArr;
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        int elementToUpdate = 3;
        int position = 4;
        nums[position] = elementToUpdate;

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Enter an element: ");
        int search = scanner.nextInt();
        for (int i = 0; i <  nums.length; ++i) {
            if (nums[i] == search) {
                System.out.println("Your search found at index: " + i);
                break;
            }
        }

        // bubble sort
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = 0; j < nums.length - i - 1; ++j) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }

}
