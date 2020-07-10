package main;

public class MaxMinFind {
    public int[] findMaxAndMin(int[] array){
        int length = array.length;
        if(length <1){
            return array;
        }
        int left = 0;
        int right = length-1;

        int[] maxmin = maxMin(array, left, right);
        System.out.println("Min: "+maxmin[0]+" Max: "+maxmin[1]);
        return maxmin;
    }

    private int[] maxMin(int[] array, int left, int right){

        int[] maxmin = new int[2];//Stores min and max in 0 and 1 resp.
        int leftEl = array[left];
        int rightEl = array[right];

        if(left == right){ // When the last element is single
            maxmin[0] = maxmin[1] = leftEl;
        }else if(left == right - 1){ // when there are only two elements

            if(leftEl<rightEl){
                maxmin[0] = leftEl;
                maxmin[1] = rightEl;
            }else{
                maxmin[1] = leftEl;
                maxmin[0] = rightEl;
            }
        } else { //more than two elements
            int mid = (left+right)/2;

            //Divide to two halves
            maxmin = maxMin(array, left, mid);
            int[] maxmin2 = maxMin(array, mid+1, right);

            //combine two halves
            if(maxmin[0] > maxmin2[0])
                maxmin[0] = maxmin2[0];
            if(maxmin[1] < maxmin2[1])
                maxmin[1] = maxmin2[1];
        }

        return maxmin;
    }
}
