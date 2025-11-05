package lecture_2;
import java.util.Scanner;

public class Task1 {
    int[] testArray;

    public static void main(String[] args) {

        Task1 t = new Task1();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements ");
        int n = sc.nextInt();
        t.testArray = new int[n];
        System.out.println("Enter " + n + " number of integers ");
        for (int i = 0; i < n; i++) {
            t.testArray[i] = sc.nextInt();
        }
        System.out.println("Array contents");
        for (int v : t.testArray) {
            System.out.print(v + " ");
        }
        sc.close();
    }
    
}
