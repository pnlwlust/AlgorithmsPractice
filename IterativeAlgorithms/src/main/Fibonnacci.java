package main;

public class Fibonnacci {

    public void printFobonacciSequence(int num){

        System.out.println("printing " + num + " Fibonnacci sequence");
        for(int i=1; i<=num; i++){
            System.out.print(findNthFibonnacciRecursively(i) + " ");
        }
        System.out.println();
        for(int i=1; i<=num; i++){
            System.out.print(findNthFibonnacciIteratively(i) + " ");
        }

    }

    public int findNthFibonnacciIteratively(int num){
        int a=0;
        int b=1;

        if (num == 1)
            return 0;
        if(num == 2 ){
            return 1;
        }

        for(int i=2; i< num; i++){
            int tmp = b;
            b = b + a;
            a = tmp;
        }

        return b;
    }

    public int findNthFibonnacciRecursively(int num){
        if (num == 1)
            return 0;
        if(num == 2 ){
            return 1;
        }

        return findNthFibonnacciRecursively(num - 1) + findNthFibonnacciRecursively(num - 2);
    }
}
