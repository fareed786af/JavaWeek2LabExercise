
public class SumOfArrayValues {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,10};
		int sum = 0;
		//Advance for Loop
		for(int num : array) {
			sum = sum+num;
		}
		System.out.println("Sum of the array elements is " + sum);
	}
}

