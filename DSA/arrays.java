import java.io.*;

class Arrays {
    int arr[] = new int[] { 1, 2, 3, 4, 5 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("The elements in the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays arrayInstance = new Arrays();
        System.out.println(arrayInstance.arr.length);
    }
}