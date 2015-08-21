/**
 * Author: Brandon B.
 * Date: 8-21-15
 */
 
public class NameThatCelebrity {
    
    public static void main(String[] args) {
    	// Set our strings.
    	String s1 = "Allan Alda";
    	String s2 = "John Wayne";
    	String s3 = "Gregory Peck";
    	String future = ">>>";

		// Get the length of each name.
		int s1_length = s1.length();
		int s2_length = s2.length();
		int s3_length = s3.length();

		// Set the first and last names.
		String s1_first = s1.substring(2, 6);
		String s1_last = s1.substring(6, s1_length - 3);

		String s2_first = s2.substring(2, 5);
		String s2_last = s2.substring(5, s2_length - 3);

		String s3_first = s3.substring(2, 6);
		String s3_last = s3.substring(6, s3_length - 3);

		// Generate the guesses.
		String s1_prompt = s1 + future + s1_first + s1_last;
		String s2_prompt = s2 + future + s2_first + s2_last;
		String s3_prompt = s3 + future + s3_first + s3_last;

		// Print the statements.
		System.out.println(s1_prompt);
		System.out.println(s2_prompt);
		System.out.println(s3_prompt);
    }
}
