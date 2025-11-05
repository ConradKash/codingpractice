package lecture_2.java;

public class D {
    public static  void Result(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == 0 && j == 0){
                    int baseAddress = System.identityHashCode(array[0][0]);
                    System.out.printf("Element %d%n", array[0][0]);
                    System.out.printf("Base addres %d%n", baseAddress );
                }
                if (i == (array.length-1) && j ==(array[i].length - 1)){
                    int baseAddress = System.identityHashCode(array[array.length-1][array[i].length - 1]);
                    System.out.printf("Element %d%n", array[array.length-1][array[i].length - 1]);
                    System.out.printf("Base addres %d%n", baseAddress );
                }
            }
        }

    }
}
