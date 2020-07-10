package main;

public class HighestCommonFactor {

    public static void main(String[] args){
        int a = 12;
        int b = 18;

        HighestCommonFactor highestCommonFactor = new HighestCommonFactor();
        int factor = highestCommonFactor.findHighestCommonFactor(a, b);
        System.out.println(factor);
    }

    /**
     * This is called Euclids algorithm for finding highest common factor
     * @param a First number
     * @param b Second number
     * @return HCF of a and b
     */
    private int findHighestCommonFactor(int a, int b){
        if (a == 0)
            return b;
        else if(b == 0)
            return a;
        else{
            while(b != 0){
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
    }
}
