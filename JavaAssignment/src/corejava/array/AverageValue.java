package corejava.array;

/**
 * Find the Average Value of the numbers array
 * Eg : Avg value of 3,4,5,6,7 is equals (3+4+5+6+7)/5
 * @author jrout
 *
 */
public class AverageValue {

	public static void main(String[] args) {
		int[] numbers = new int[]{10,20,30,25,16,70,100};
		int avg;
		int sum;
		for(int i = 0;i<numbers.length; i++){
			sum = sum + numbers[i];
			System.out.println( sum/numbers.length);
			
		
		
		// Write a for loop or while loop to find the average
	}
}
/*
Output of Calculate Average value of Array elements using Java Example would be
Average value of array elements is : 38
*/
