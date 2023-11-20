package dataStructures;

public class arrayTransversal {
  
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};

            // Traversing the array
            System.out.println("Original array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            // Reversing the array
            System.out.println("Reversed array:");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }

            // Getting the base address of the array
            int baseAddress = System.identityHashCode(arr);
            System.out.println("Base address of the array: " + baseAddress);


            // 2 dimensional array
            int[][] arr2D = {{1, 2, 3,}, 
                            {4, 5, 6},
                            {7, 8, 9},
                            {10, 11 ,12}};

            // Traversing the 2D array
            System.out.println("Original 2D array:");
            for (int i = 0; i < arr2D.length; i++) {
                for (int j = 0; j < arr2D[i].length; j++) {
                    System.out.print(arr2D[i][j] + " ");
                }
                System.out.println();
            }

            // Reversing the 2D array
            System.out.println("Reversed 2D array:");
            for (int i = arr2D.length - 1; i >= 0; i--) {
                for (int j = arr2D[i].length - 1; j >= 0; j--) {
                    System.out.print(arr2D[i][j] + " ");
                }
                System.out.println();
            }

            // Getting the base address of the array
            int baseAddress2D = System.identityHashCode(arr2D);
            System.out.println("Base address of the 2D array: " + baseAddress2D);
            
            
        }
}
