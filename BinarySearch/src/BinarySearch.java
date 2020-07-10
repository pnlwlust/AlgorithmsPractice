import java.util.*;

public class BinarySearch {

    public static void main(String[] args){
        List<String> listOfFruits = List.of("apple", "banana", "apricot", "pineapple","cherry","avocado","watermelon","litchi","grapes","mango","orange","guava");
        System.out.println("App Started");
        String searchWord1 = "guava";
        String searchWord2 = "apricot";
        String searchWord3 = "apcot";

        long startTime = System.currentTimeMillis();
        int found = searchFromList(listOfFruits, searchWord1);
        System.out.printf("Time Taken: %d ms\n" , System.currentTimeMillis() - startTime);
        System.out.println("Search Result: "+ found );
        System.out.printf("Time Taken after println: %d ms\n" , System.currentTimeMillis() - startTime);
    }

    public static int searchFromList(List<String> list, String word){

        List<String> newList = new ArrayList<String>(list);
        Collections.sort(newList);

        int first = 0;
        int last = newList.size() - 1;
        while(first <= last){
            int mid = (last+first)/2;
            System.out.println(mid);
            int com = word.compareTo(newList.get(mid));
            System.out.println(com);
            if(com == 0){
                return mid;
            }
            else if(com < 0){
                last = mid-1;
            }
            else {
                first = mid +1;
            }
        }
        return -1;
    }
}
