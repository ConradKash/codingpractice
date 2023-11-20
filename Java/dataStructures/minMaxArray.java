package dataStructures;

public class minMaxArray {
    public void sort(char[] arr) {
        char temp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);
    }

    public char max(char[] arr) {
        
        return arr[arr.length - 1];
    }
    public char min(char[] arr) {
        
        return arr[0];
    }
    
    public static void main(String[] args) {

        minMaxArray mma = new minMaxArray();
        char[] arr = { 'c', 'z', 'm', 'k', 'u', 'k'};
        mma.sort(arr);

        System.out.println(mma.max(arr));
        System.out.println(mma.min(arr));
    }
}
