import java.util.*;
public class MyKoreanChangeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount, originalAmount,
		n1, n2, n3, n4, n5;
		
		System.out.println("Enter a whole number from 1 to 10000.");
		Scanner keyboard = new Scanner(System.in);
		amount = keyboard.nextInt();
	
		originalAmount = amount;
		n1 = amount/500;
		amount = amount%500;
		n2 = amount/100;
		amount = amount%100;
		n3 = amount/10;
		amount = amount%10;
		n4 = amount/5;
		amount = amount%5;
		n5 = amount/1;
		
		System.out.println(originalAmount+" won in coins can be given as:");
		System.out.println(n1+" 500 won");
		System.out.println(n2+" 100 won");
		System.out.println(n3+" 10 won");
		System.out.println(n4+" 5 won");
		System.out.println(n5+" 1 won");
		
		
	}

}
