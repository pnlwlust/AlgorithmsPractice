package test;

import main.MergeSort;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    public void mergeSortTest(){
        int[] array = new int[]{1,3,4,2,5,1,6,9,7};

        System.out.println("Original: ");
        for (int el : array){
            System.out.print(el + " ");
        }
        MergeSort.sort(array);

        System.out.println("\nSorted: ");
        for (int el : array){
            System.out.print(el + " ");
        }
    }
}
