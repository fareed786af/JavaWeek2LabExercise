
public class CastingExercise {
	//Don't run this program - Just type an understand how casting works
	public static void main(String[] args) {
		byte b = 10;
		
		int i = b;//will accept - automatic type promotion
		
		//byte c = i; will not accept - because lower type cannot be put in higher
		int c = i;
		
		byte d = (byte)i;//Type casting makes it possible to score compatible types.
		
		byte x = 10;
		byte y = 20;
		
		//byte sum = x * y; Error is thrown because when two bytes are used in a 
		//Arithmetic operation , the result will be integer.
		int sum = x * y;
		System.out.println("The sum is " + sum);
		
		
	}
	

}
