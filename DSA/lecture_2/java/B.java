package lecture_2.java;

public class B {
    // Size of each element in bytes (assuming int type)
    private static final int ELEMENT_SIZE = 4;


    // Calculate base address for 2D array
    public static int calculateBaseAddress2D(int[][] arr, int i, int j) {
        int cols = arr[0].length;
        return ELEMENT_SIZE * (i * cols + j);
    }

    // Calculate base address for 3D array
    public static int calculateBaseAddress3D(int[][][] arr, int i, int j, int k) {
        int rows = arr[0].length;
        int cols = arr[0][0].length;
        return ELEMENT_SIZE * ((i * rows * cols) + (j * cols) + k);
    }

    // Traverse and print 1D array
    public static void traverse1D(int[] arr) {
        System.out.println("1D Array Traversal:");
        int baseAddress = System.identityHashCode(arr);
        System.out.printf("Base address is %d%n", baseAddress);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element at index %d: %d\n", 
                            i, arr[i]);
        }
    }

    // Traverse and print 2D array
    public static void traverse2D(int[][] arr) {
        System.out.println("\n2D Array Traversal:");
        int baseAddress = System.identityHashCode(arr);
        System.out.printf("Base address is %d%n", baseAddress);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Element at [%d][%d]: %d\n", 
                                i, j, arr[i][j]);
            }
        }
    }

    // Traverse and print 3D array
    public static void traverse3D(int[][][] arr) {
        System.out.println("\n3D Array Traversal:");
        int baseAddress = System.identityHashCode(arr);
        System.out.printf("Base address is %d%n", baseAddress);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.printf("Element at [%d][%d][%d]: %d\n", 
                                    i, j, k, arr[i][j][k]);
                }
            }
        }
    }
}
