package test;

import main.QuickSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {

    @Test
    public void quickSortTest(){
        int[] array = new int[]{1,3,4,2,5,1,6,9,7};

        System.out.println("Original: ");
        for (int el : array){
            System.out.print(el + " ");
        }
        QuickSort.sort(array);

        System.out.println("\nSorted: ");
        for (int el : array){
            System.out.print(el + " ");
        }
    }

    @Test
    public void primitiveArrayLengthTest(){
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 3;
        array[2] = 4;
        System.out.println(array.length);

        ArrayList<Integer> obArray = new ArrayList<Integer>(5);
        obArray.add(1);
        obArray.add(2);
        obArray.add(3);

        System.out.println(obArray.size());
    }
}
