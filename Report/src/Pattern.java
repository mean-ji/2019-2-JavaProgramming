import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("input line number: ");
		int n1;
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		for(int k = 1; k <= n1; k++) {
			for(int l = 0; l< n1-k; l++) {
				System.out.print(" ");
			}
			for( int i = 1; i <= k; i++) {
				System.out.print(i);	
			}
			for( int i = k-1; i >= 1; i--) {
				System.out.print(i);	
			}
			System.out.println("");
		}
		
	}

}
