package CodingInterview;
import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		String reversed = "";
		
		//Loop to iterate the string 
		for (int i = str.length() - 1; i>=0; i--) {
			reversed = reversed + str.charAt(i);
		}
		
		System.out.println(reversed);
	}
}
