
import java.util.Stack;
import java.util.Scanner;

/**
 * Megan Cole
 * CS 215
 * Palindrome checker using a stack 
 */
public class Palindrome {

	public static void main(String[] args) {
		
		/**
		 * Get palindrome input from user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the palindrome you would like to test: ");
		String name = sc.nextLine();
		System.out.println("The palindrome you entered is: " + name);
		
		/**
		 * Remove non-character values from the string and convert the string to lower case
		 */
		for ( int i = 0; i < name.length(); i++) {
			  name = name.replaceAll("[^a-zA-Z]", "").toLowerCase();
			}
		System.out.println("Your palindrome after removing extra characters is: " + name);
		
		//Create a stack using the characters in our string
		Stack<Character> charStack = new Stack<>();
		
		/**
		 * Push each character from the string into the stack
		 */
		for (int i = 0; i < name.length(); i++) {
			charStack.push(name.charAt(i));
		}
		
		/**
		 *  Look at items in the stack
		 */
		System.out.println("The characters in the stack are: " + charStack);
		
		
		/**
		 * Pop items from the stack to check if it's a palindrome
		 */
		boolean isPalindrome = true;
		for (int i = 0; i < name.length(); i++) {
			if (charStack.pop() != name.charAt(i)){
				isPalindrome = false;
				break;
			}
		}
		
		/**
		 * Print if the string is or is not a palindrome
		 */
		
		if (isPalindrome) {
			System.out.println("The given string is a palindrome.");
		} else {
			System.out.println("The given string is NOT a palindrome.");
		}
		
	} //end main

} //end class
