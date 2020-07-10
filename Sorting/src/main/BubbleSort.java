package main;

public class BubbleSort {
    public void sortAndPrint(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        long startTime = System.currentTimeMillis();
        bubbleSort(array);
        System.out.println("Sorted Array: "+ (System.currentTimeMillis() - startTime) + " ms");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    private void bubbleSort(int[] array){
        int length = array.length;
        for(int i=0; i<length; i++){
            for(int j=0; j<length-1-i; j++){
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
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
