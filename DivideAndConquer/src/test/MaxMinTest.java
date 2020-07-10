package test;

import main.MaxMinFind;
import org.junit.jupiter.api.Test;

public class MaxMinTest {

    @Test
    public void findMaxMinTest(){
        int[] array = new int[]{2,3,6,3,7,9,1,5,1};
        MaxMinFind maxMinFind = new MaxMinFind();
        maxMinFind.findMaxAndMin(array);
    }

}
