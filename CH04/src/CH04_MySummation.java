import java.util.Scanner;
public class CH04_MySummation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number:");
		int n1;
		Scanner keyboard = new Scanner(System.in);
		n1=keyboard.nextInt();
		int count;
		int sum = 0;
		
		for(count =1 ; count <= n1; count++) {
			sum = sum + count;
		}
		System.out.println("The summation from 1 to "+ n1 +" is");
		System.out.println(sum);
	}

}
