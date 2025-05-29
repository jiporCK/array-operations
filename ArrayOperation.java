package array;

public class ArrayOperation {

    public static void main(String[] args) {

        // Basic Array Operations
        int[] arr = {10, 9, 5, 4, 2, 18};

        int pos = 3;
        arr[pos] = 7;
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
        arr = newArr;
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

}
