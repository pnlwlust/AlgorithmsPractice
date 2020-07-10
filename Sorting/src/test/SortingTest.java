package test;

import main.BubbleSort;
import main.InsertionSort;
import main.SelectionSort;
import org.junit.Test;

public class SortingTest {

    @Test
    public void insertionSortTest(){
        int[] array = { 2,5,3, 7, 9, 1, 2};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortAndPrint(array);
    }

    @Test
    public void bubbleSortTest(){
        int[] array = { 2,5,3, 7, 9, 1, 2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortAndPrint(array);
    }

    @Test
    public void selectionSortTest(){
        int[] array = { 2,5,3, 7, 9, 1, 2};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortAndPrint(array);
    }
}
