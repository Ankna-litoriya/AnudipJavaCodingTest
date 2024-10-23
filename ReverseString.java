package CodingInterview;

public class ReverseString {

	public static void main(String args[]) {
		String str = "hello world";
		String reversed = "";
		
		//Loop to iterate the string 
		for (int i = str.length() - 1; i>=0; i--) {
			reversed = reversed + str.charAt(i);
		}
		
		System.out.println(reversed);
	}
}
