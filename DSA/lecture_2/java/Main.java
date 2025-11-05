package lecture_2.java;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Example arrays
        int[] array1D = {1, 2, 3, 4, 5};
        int[][] array2D = {{1, 2}, {3, 4}, {5, 6}};
        int[][][] array3D = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        // Call traversal methods
        B.traverse1D(array1D);
        B.traverse2D(array2D);
        B.traverse3D(array3D);

        // Demonstrate array merging
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] mergedArray = C.mergeArrays(firstArray, secondArray);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

        // Create a 2D array for testing
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        D.Result(testArray);
    }
    
}
