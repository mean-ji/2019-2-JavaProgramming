import java.util.Scanner;

public class Palindrome {
	/**
	Precondition: The array a contains letters and
	blanks in positions a[0] through a[used − 1].
	Returns true if the string is a palindrome and
	false otherwise.
	*/

	public static boolean isPalindrome(char[] a, int used) {
		int i = 0;
		
		while(i < used) {
			if(a[i]!=a[used]) return false;
			i++;
			used--;
		}
		return true;
			
		
	}
	
	

}
