import java.util.Scanner;

public class Palindrom_main {
public static void main(String[] args) { 
		
		char yesOrNo='y';
		String inputC="";
		char[] input = new char[80];
		
		while(yesOrNo!='n') {
			int i = 0;
			for(int j = 0; j <80; j++) input[j]=' ';
			while(true) {
				System.out.println("Input any String you want Palindrome test! ");
				System.out.println("Test is start if you input your string last part . ");
				System.out.print("input:  ");
				Scanner keyboard = new Scanner(System.in);
				inputC = keyboard.nextLine();
				inputC = inputC.replaceAll(" ","");
				inputC = inputC.toLowerCase();
				for(int k = 0; k < inputC.length(); k++) {
					input[i] = inputC.charAt(k);
					i++;
				}
				
				if(input[i-1]=='.') break;
				
			}
			boolean TF = Palindrome.isPalindrome(input, i-2);

			System.out.print("It is " + TF+"!!!");
			System.out.print("\nDo you want more try?? input y or n : ");
			Scanner keyboard = new Scanner(System.in);
			yesOrNo=keyboard.next().charAt(0);
		}
	}
}
