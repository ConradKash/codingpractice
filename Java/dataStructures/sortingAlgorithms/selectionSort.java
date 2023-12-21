public class selectionSort{
    int array [];
    public selectionSort(int array[]){
        this.array = array;
    }
    public void sort(){
        int n = array.length;

        for (int i = 0; i<n; i++){
                for (int j = i+1; j < n; j++){
                    if (array[i]> array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;                        
                    }
                }
        }

        System.out.println("Sorted array: ");
        for (int m = 0; m < n; m++){
            System.out.print(array[m]);
        }
    }   
    public static void main(String[] args){
        int arrays[] = {1, 8, 4, 6, 5};
        selectionSort ss = new selectionSort(arrays);
        ss.sort();
    }

}


