import java.util.Scanner;
public class PrintANumber {
	public static void main(String[] args) {
		
		//creates a reader instance which takes
		//input from the standard keyboard
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		
		// nextInt() reads the integer from the keyboard
		int number = reader.nextInt();
		
		//println() prints the following line into the output screen
		System.out.println("You entered: " + number);
	}

}
