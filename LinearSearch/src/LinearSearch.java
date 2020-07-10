import java.util.List;
import java.util.Objects;

class LinearSearch{

	public static void main(String[] args){
		List<String> listOfFruits = List.of("apple", "banana", "apricot", "pineapple","cherry","avocado","watermelon","litchi","grapes","mango","orange","guava");
		System.out.println("App Started");
		String searchWord1 = "guava";
		String searchWord2 = "apricot";
		String searchWord3 = "apcot";

		LinearSearch linearSearch = new LinearSearch();
		long startTime = System.currentTimeMillis();
		int found = linearSearch.searchFromList(listOfFruits, searchWord1);
		System.out.printf("Time Taken: %d ms\n" , System.currentTimeMillis() - startTime);
		System.out.println("Search Result: "+ found );
		System.out.printf("Time Taken after println: %d ms\n" , System.currentTimeMillis() - startTime);
	}

	public int searchFromList(List<String> list, String word){

		for(int i=0; i<list.size(); i++){
			if(Objects.equals(list.get(i), word)){
				return i;
			}
		}
	    return -1;
	}
}
