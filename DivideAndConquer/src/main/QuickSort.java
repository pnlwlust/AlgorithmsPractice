package main;

import org.jetbrains.annotations.NotNull;

public class QuickSort {

    public static void sort(int[] array){
        int left = 0;
        int right = array.length-1;
        recurse(array, left, right);
    }

    private static void recurse(int[] array, int left , int right){
        int pivot = left;
        int leftP = left;
        int rightP =right;
        //Partition phase
        if(left<right){
//            while(leftP<rightP){
/*
                while(array[leftP] < array[pivot])
                    leftP++;
                while(array[rightP]>array[pivot])
                    rightP--;

*/
                if(array[leftP]>array[rightP]){
                    swap(array, leftP, rightP);
                }
//            }
                pivot = rightP;

            //divide phase
            recurse(array, left,pivot-1);
            recurse(array, pivot+1, right);

        }

    }
    private static void swap(int @NotNull [] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
