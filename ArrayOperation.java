package array;

public class ArrayOperation {

    public static void main(String[] args) {

        // Basic Array Operations
        int[] arr = {10, 9, 2, 5, 4, 2, 18};
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
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
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

    }

}
