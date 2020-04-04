
public class ArrayInitialiser {

	public static void main(String[] args) {
		
		//initialiser list specifies the initial value for each element
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.printf("%s%8s%n", "Index", "Value");
	
		//output for each array element's value
		for (int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
		//this is an example of accessing the 3rd element in the array using the subscript 2.
		//System.out.printf("%d%n", array[2]);
	}

}
