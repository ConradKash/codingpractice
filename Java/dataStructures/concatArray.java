package dataStructures;

public class concatArray {

    public static void main(String[] args) {
        // Declare and initialize two arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Determine the lengths of both arrays
        int length1 = array1.length;
        int length2 = array2.length;

        // Create a new array with a length equal to the sum of the lengths of the two arrays
        int[] mergedArray = new int[length1 + length2];

        // Copy the elements from the first array to the new array
        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy the elements from the second array to the new array
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        // Print the merged array
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        // Declare and initialize two character arrays
        char[] array3 = {'a', 'b', 'c'};
        char[] array4 = {'d', 'e', 'f'};

        // Determine the lengths of both arrays
        int length3 = array3.length;
        int length4 = array4.length;

        // Create a new array with a length equal to the sum of the lengths of the two arrays
        char[] mergedArrayC = new char[length3 + length4];

        // Copy the elements from the first array to the new array
        for (int i = 0; i < length3; i++) {
            mergedArrayC[i] = array3[i];
        }

        // Copy the elements from the second array to the new array
        for (int i = 0; i < length4; i++) {
            mergedArray[length3 + i] = array4[i];
        }

        // Print the merged array
        for (int i = 0; i < mergedArrayC.length; i++) {
            System.out.print(mergedArrayC[i] + " ");
        }
    }
}
