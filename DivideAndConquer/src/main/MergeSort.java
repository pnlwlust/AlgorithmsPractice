package main;

public class MergeSort {

    public static void sort(int[] array){
        if(array.length < 1){
            throw new IllegalArgumentException("Input Array is empty");
        }
        int first = array[0];
        int last = array[array.length-1];

        divideAndSort(array, first, last);
        System.out.println("\nSorted: ");
        for (int el : array){
            System.out.print(el + " ");
        }
    }

    private static void divideAndSort(int[] array, int first, int last){

        if(first == last){
        } else if(first == last-1){
            int firstEl = array[first];
            int lastEl = array[last];
            if(firstEl > lastEl)
                swap(array, first, last);
        } else {
            int mid = (first + last)/2;

           divideAndSort(array, first, mid);
           divideAndSort(array, mid + 1, last);
        }
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
