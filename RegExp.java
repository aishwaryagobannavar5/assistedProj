package regExp;
// Main class
public class RegExp {

	// Main driver method
	public static void main(String args[])
	{
		// Declaring and initializing a string
		String Str1
			= new String("Welcome to geeksforgeeks");

		// Initializing test string
		String Str2 = new String("GEEKS");

		// Tests whether GEEKS starts in geeksforgeeks
		// starting from pos 11 and
		// compares 5 characters of GEEKS
		System.out.print(
			"Checking if GEEKS is in geeksforgeeks( case sensitive ) : ");
		System.out.println(
			Str1.regionMatches(11, Str2, 0, 5));
	}
}
