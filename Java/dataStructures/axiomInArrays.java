package dataStructures;
// In the context of array operations, axioms are fundamental principles or rules that govern the behavior and properties of arrays. 
//These axioms help define the expected behavior of array operations and ensure consistency and correctness in array manipulation.

// Some common axioms in array operations include:
// Indexing: Arrays are typically zero-indexed, meaning the first element is accessed using index 0, the second element using index 1, and so on.
// Length: Arrays have a fixed length, which is determined at the time of creation and cannot be changed. The length of an array represents the number of elements it can hold.
// Element Access: Elements in an array can be accessed using their index. The index must be within the valid range of indices for the array.
// Element Modification: Elements in an array can be modified by assigning a new value to the corresponding index.
// Bounds Checking: Array operations should perform bounds checking to ensure that the index being accessed is within the valid range of indices for the array. Accessing an index outside the valid range can result in an error or unexpected behavior.
// Iteration: Arrays can be iterated over using loops or other iteration constructs to perform operations on each element.
// These axioms provide a foundation for working with arrays and guide developers in writing correct and efficient array operations.

public class axiomInArrays{
    public static void main(String[] args) {
        // Indexing
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]); // 1
        System.out.println(arr[1]); // 2
        System.out.println(arr[2]); // 3
        System.out.println(arr[3]); // 4
        System.out.println(arr[4]); // 5

        // Length
        System.out.println(arr.length); // 5

        // Element Access
        System.out.println(arr[0]); // 1
        System.out.println(arr[1]); // 2
        System.out.println(arr[2]); // 3
        System.out.println(arr[3]); // 4
        System.out.println(arr[4]); // 5

        // Element Modification
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Bounds Checking
        // System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        // Iteration
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] * 2; // [20, 40, 60, 80, 100
            System.out.println(arr[i]);

        }

        String firstString = "Hello";
        Character[] charArray = new Character[firstString.length()];
        for(int i=0; i<firstString.length(); i++){
            charArray[i] = firstString.charAt(i);
            System.out.print(charArray[i]);
        }
        

    }

}