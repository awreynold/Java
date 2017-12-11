/**
 * @author Art
 *
 */
public class FindDuplicatesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 1};
		
		System.out.println(hasDuplicate(numArray));
	}
		
	/**
	 * checks if the array has duplicate values.
	 * @param numArray Array of ints passed in to be checked
	 * @return true if there are duplicates, false if there are none
	 */
	private static boolean hasDuplicate(int[] numArray) {
		boolean found = false;
		int numFound = 0;
		
		//outside loop to loop thru the entire array that is passed in
		for(int i : numArray) {
			//inside loop that checks the i value against all the values in the passed in loop
			for(int x : numArray) {
				if(i == x) { //if i is equal to x then we increase numFound to show that an instance of the value was found
					numFound++;
				}
			}
			
			if(numFound >= 2) { //if 2 or more instances of the value is found in the array then there are duplicates and we can exit the loop
				found = true;
				break;
			}else {
				numFound = 0;
			}
		}
		
		return found; //returns true if there are duplicates in the array, false if there are none.
	}
	
}
