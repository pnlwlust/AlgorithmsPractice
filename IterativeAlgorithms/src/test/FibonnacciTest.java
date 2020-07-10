package test;

import main.Fibonnacci;
import org.junit.Test;

public class FibonnacciTest {

    @Test
    public void testFibonacciIteratively(){
        Fibonnacci fibonnacci = new Fibonnacci();
        int num = 8;
        var result = fibonnacci.findNthFibonnacciIteratively(num);
        System.out.println(result);

    }

    @Test
    public void testFibonacciRecursively(){
        Fibonnacci fibonnacci = new Fibonnacci();
        int num = 8;
        var result = fibonnacci.findNthFibonnacciRecursively(num);
        System.out.println(result);

    }

    @Test
    public void testFibonnacciSequence(){

        Fibonnacci fibonnacci = new Fibonnacci();
        int num = 8;
        fibonnacci.printFobonacciSequence(num);
    }
}
