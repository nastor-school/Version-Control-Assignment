package cop2805;

public class Homework3 {

	// Max Method
	// Returns largest value within an array of any data type that extends Comparable
	public static <E extends Comparable<E>> E max (E [] list) {
		
		// Assign the first index of the array to the maxElement variable
		E maxElement = list[0];
		
		// Loop through the entire array
		// Check to see if any value is larger than current maxElement variable value and replace the values if it is
		for(E element : list) {
			if (element.compareTo(maxElement) > 0)
				maxElement = element;
		}
		
		// Return the final maxElement value after the array has been looped through
		return maxElement;
	}
	
	// Main Method
	public static void main(String[] args) {

		// Create our three arrays
		String[] colors = {"Red","Green","Blue"};
	    Integer[] numbers = {1, 2, 3};
	    Double[] circleRadius = {3.0, 5.9, 2.9};

	    // Print to the system the name of the array followed by the results of the max method
	    System.out.println("Colors: " + max(colors));
	    System.out.println("Numbers: " + max(numbers));
	    System.out.println("Circle Radius: " + max(circleRadius));
	    
	}

}