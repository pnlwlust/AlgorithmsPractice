package main;

public class SelectionSort {
    public void sortAndPrint(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        long startTime = System.currentTimeMillis();
        selectionSort(array);
        System.out.println("Sorted Array: "+ (System.currentTimeMillis() - startTime) + " ms");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private void selectionSort(int[] array){
        int length = array.length;
        for(int i=0; i<length; i++){
            int minI = i;
            for(int j=i+1; j<length; j++){
               if(array[minI] > array[j]){
                   minI = j;
               }
            }
            swap(array, i, minI);
        }
    }


    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
