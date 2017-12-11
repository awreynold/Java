import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	static final ArrayList<Integer> numArrayListwDups = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3));	
	static final ArrayList<Integer> numArrayListwoDups = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
	
   public static void main(String args[]) {
	   System.out.println("Does the list contain duplicates: " + containsDuplicates(numArrayListwDups));
	   System.out.println("Does the list contains duplicates: " + containsDuplicates(numArrayListwoDups));
		
	   System.out.println("List without Duplicates:");
	   removeDuplicates(numArrayListwDups).forEach(System.out::println);
	  
	   System.out.println("Duplicates in the list:");
	   findDuplicates(numArrayListwDups).forEach(System.out::println);
   }
   
   /**
    * checks if the list contains duplicates
    * @param numArrayList ArrayList<Integer> of Integers to be checked
    * @return true if there are duplicates, false if there are none
    */
   private static boolean containsDuplicates(List<Integer> numArrayList) {
	   boolean dup = false;
	   
	   Stream<Integer> numbers = numArrayList.stream().distinct(); //pulls out the distinct values from the list
	   dup = (numArrayList.size() != numbers.count()) ? true:false; //if sizes match return true else return false 
	   
	   return dup;
   }
   
   /**
    * returns a set containing all the duplicates in the array
    * @param numArrayList List<Integer> to be searched
    * @return Set<Integer> containing the values that were duplicates
    */
   private static Set<Integer> findDuplicates(List<Integer> numArrayList){   
	  return numArrayList.stream().filter(i -> Collections.frequency(numArrayList, i) > 1)
	  					   .collect(Collectors.toSet()); //returns a Set holding the values of all the duplicates from the List
   }
   
   /**
    * removes all duplicates from the list
    * @param numArrayList list of integers that have duplicates
    * @return List<Integer> that contains no duplicates
    */
   private static List<Integer> removeDuplicates(List<Integer> numArrayList){
	   List<Integer> withoutDups = numArrayList.stream()
			   .distinct() //pulls out the distinct values from the list
			   .collect(Collectors.toList()); //collects those distinct values into a list that is returned
	   
	   return withoutDups;
   }
}