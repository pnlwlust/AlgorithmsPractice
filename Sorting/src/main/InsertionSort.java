package main;

public class InsertionSort {

    public void sortAndPrint(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        long startTime = System.currentTimeMillis();
        insertionSort(array);
        System.out.println("Sorted Array: "+ (System.currentTimeMillis() - startTime) + " ms");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public void insertionSort(int[] array){

        int length = array.length;
        for(int i=0; i<length; i++){
            for(int j= i; j>0; j--){
                if(array[j-1] > array[j]){
                    swap(array, j, j-1);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
