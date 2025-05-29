package array;

import java.util.Scanner;

public class ArrayLesson {
    public static void main(String[] args) {

        String name = "Koko";

        // declare array with predefined size
        String[] names = new String[3];
        // assign value to array
        names[0] = "koko1";
        names[1] = "koko2";
        names[2] = "koko3";

        System.out.println(names[1]);

        // initialization
        int[] nums1 = new int[]{3, 5, 7, 18};
        System.out.println(nums1.length);
        System.out.println(nums1[2]);

        int[] nums2 = {4, 3, 6, 19, 23}; // shorthand initialization
        System.out.println(nums2.length);
        int lastIndex = nums2.length - 1; // index of last element
        System.out.println(nums2[lastIndex]); // last element of array

        String[] products;
        // products = {"Coca", "Pepsi", "Fanta} : we cannot use this
        products = new String[]{"Coca", "Pepsi", "Fanta"};

        for (int i = 0; i < products.length; ++i) {
            System.out.print(products[i] + " ");
        }
        // Coca Pepsi Fanta

        for (String product : products ) {
            System.out.print(product + " ");
        }
        System.out.println();

        int[][][] numbers = new int[][][]{
                {
                        {2, 4, 6},
                        {3, 6, 7},
                        {5, 8, 2}
                },
                {
                        {2, 4, 6},
                        {3, 11, 7},
                        {5, 8, 2}
                }
        };

        for (int[][] i : numbers) {
            for (int[] j : i) {
                for (int number : j) {
                    System.out.print(number + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        String[][] buildingLoot = new String[3][];

        buildingLoot[0] = new String[]{"M4", "Bag pack", "Medkit"};
        buildingLoot[1] = new String[]{"Vest", "Helmet"};
        buildingLoot[2] = new String[]{"Kar98"};

        for (String[] building: buildingLoot) {
            for (String item: building) {
                System.out.println(item + " ");
            }
            System.out.println();
        }

    }
}
